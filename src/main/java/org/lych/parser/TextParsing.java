package org.lych.parser;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class TextParsing {
    public void topWords(String text) throws IOException {
        String conjunctionsAndPrepositionsAndPronouns = "";
        text = text.toLowerCase();
        Path path = Paths.get("conjunctionsAndPrepositionsAndPronouns.txt");
        Scanner scanner = new Scanner(path, "CP1251");
        TreeMap<String, Integer> textsWords = new TreeMap<String, Integer>();
        StringTokenizer tokenizer = new StringTokenizer(text, "\t\n\r\f,.—!?\"()-0123456789<>|}{[]@#$%^&*+=:;");


        String modernText = "";
        while (tokenizer.hasMoreTokens()) {
            modernText += tokenizer.nextToken();

        }
        String[] textsWordsArray = modernText.split(" ");
        int repeats = 1;
        for (String word : textsWordsArray) {
            if (textsWords.containsKey(word)) {
                repeats = textsWords.get(word);
                textsWords.put(word, ++repeats);
                repeats = 1;
            } else textsWords.put(word, repeats);
        }
        while (scanner.hasNextLine()) {
            conjunctionsAndPrepositionsAndPronouns += scanner.nextLine();
        }
        scanner.close();
        String []arrayOfconj =conjunctionsAndPrepositionsAndPronouns.split(",");
        for (String word : arrayOfconj) {
            if (textsWords.containsKey(word)) {
                textsWords.remove(word);
            }
        }
        textsWords.remove("");
        TreeMap<Integer, String> sortMap = new TreeMap<Integer, String>(Collections.reverseOrder());
        int count = 0;
        for(Map.Entry<String,Integer>map:textsWords.entrySet())
        {

                          sortMap.put(map.getValue(), map.getKey());


             }
        System.out.println("Топ-10 часто используемых слов:");
            for (Map.Entry<Integer, String> map : sortMap.entrySet()) {
                if (count < 10) {
                    System.out.println(map.getValue().substring(0,1).toUpperCase() +map.getValue().substring(1)+
                            " (Встретилось :" + map.getKey()+" раз(а))");
                    count++;
                } else break;
            }
        }

    }


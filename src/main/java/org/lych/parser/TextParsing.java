package org.lych.parser;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class TextParsing {
    public void topWords(String text) throws IOException {/*Метод выполняющий поиск 10 самых частоиспользуемых слов в тексте.
                                                  A method that searches for the 10 most frequently used words in the text.*/
        String conjunctionsAndPrepositionsAndPronouns = "";
        text = text.toLowerCase();
        Path path = Paths.get("conjunctionsAndPrepositionsAndPronouns.txt");/*Файл с союзами, предлогами
                                                                                      и местоимениями.
                                                                                      File with conjunctions, prepositions
                                                                                      and pronouns.*/
        Scanner scanner = new Scanner(path, "CP1251");
        TreeMap<String, Integer> textsWords = new TreeMap<String, Integer>();
        StringTokenizer tokenizer = new StringTokenizer(text, "\t\n\r\f,.—!?\"()-0123456789<>|}{[]@#$%^&*+=:;");


        String modernText ="";
        while (tokenizer.hasMoreTokens()) {/*Цикл исключающий ненужное для анализа.
                                             A cycle in which unnecessary symbols are eliminat*/
            modernText += tokenizer.nextToken();

        }
        String[] textsWordsArray = modernText.split(" ");
        int repeats = 1;
        for (String word : textsWordsArray) {/*Цикл в котором в TreeMap записываются слова из текста и
                                             сколько раз они втречались в тексте.
                                             A loop in which words from text are written to TrayMap and
                                             how many times they met in the text.*/
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
        for (String word : arrayOfconj) {/*Цикл в котором местоимения союзы и предлоги исключаются из TreeMap.
                                           Cycle in which the pronouns unions and prepositions are excluded
                                           from the TreeMap*/
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


package org.lych.reading;


import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadingFromFile {
    public String input(String thePathToTheFile) throws IOException  {/*Метод выполняющий считывание текста из файла
                                                                          A method that reads text from a file*/
        String text="";
        Path path= Paths.get(thePathToTheFile);
        Scanner scanner=new Scanner(path);
        while (scanner.hasNextLine())
        {
            text+=scanner.nextLine()+"\n";
        }
        scanner.close();
        return text;
    }
}

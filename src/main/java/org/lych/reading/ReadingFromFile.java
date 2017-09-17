package org.lych.reading;

import javax.sound.sampled.Control;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadingFromFile {
    public String input(String thePathToTheFile) throws IOException  {
        String text="";
        Path path= Paths.get(thePathToTheFile);
        Scanner scanner=new Scanner(path,"CP1251");
        while (scanner.hasNextLine())
        {
            text+=scanner.nextLine()+"\n";
        }
        scanner.close();
        return text;
    }
}

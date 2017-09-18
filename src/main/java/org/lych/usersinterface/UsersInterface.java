package org.lych.usersinterface;

import org.lych.reading.ReadingFromFile;
import org.lych.threads.ThreadForTextParsing;
import org.lych.threads.ThreadForBrackets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsersInterface {
    public void startProject() throws IOException, InterruptedException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите путь к файлу:");
        String fileName=reader.readLine();
        reader.close();
        ReadingFromFile readingFile=new ReadingFromFile();
        String text =readingFile.input(fileName);
        ThreadForBrackets balance=new ThreadForBrackets(text);
        balance.start();
        ThreadForTextParsing words=new ThreadForTextParsing(text);
        words.start();




    }
}

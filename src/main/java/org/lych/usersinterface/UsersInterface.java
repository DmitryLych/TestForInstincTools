package org.lych.usersinterface;

import org.lych.reading.ReadingFromFile;
import org.lych.threads.SecondThread;
import org.lych.threads.FirstThread;

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
        FirstThread balance=new FirstThread(text);
        balance.start();
        SecondThread words=new SecondThread(text);
        words.start();




    }
}

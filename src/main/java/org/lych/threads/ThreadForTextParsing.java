package org.lych.threads;

import org.lych.parser.TextParsing;

import java.io.IOException;

public class ThreadForTextParsing extends Thread {
    String text;
    public ThreadForTextParsing(String text)
    {
        this.text=text;
    }
    @Override
    public void run()
    {
        TextParsing words=new TextParsing();
        try {
            words.topWords(text);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
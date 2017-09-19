package org.lych;


import org.lych.usersinterface.UsersInterface;

import java.io.IOException;
import java.io.PrintStream;

public class Main {
    public static void main(String []agrs) throws InterruptedException {
        UsersInterface start=new UsersInterface();

        try {
            start.startProject();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

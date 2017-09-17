package org.lych.threads;

import org.lych.parser.BalanceOfBrackets;

public class FirstThread extends Thread {
    String text;
    String answer;
    public FirstThread(String text)
    {
        this.text=text;
    }
    @Override
    public void run()
    {
        BalanceOfBrackets balance=new BalanceOfBrackets();
        balance.balanceOfBrackets(text);
    }
}

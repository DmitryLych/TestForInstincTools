package org.lych.threads;

import org.lych.parser.BalanceOfBrackets;

public class ThreadForBrackets extends Thread {
    String text;
    public ThreadForBrackets(String text)
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

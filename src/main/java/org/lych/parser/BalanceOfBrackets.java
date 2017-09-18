package org.lych.parser;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BalanceOfBrackets {
    public void balanceOfBrackets(String text) { /*Метод анализирующий текст на корректность расстановки скобок.
                                                 A method that analyzes the text for the correctness of the brackets.*/
        Stack test = new Stack();
        Pattern pattern = Pattern.compile("[]]|[)]|[}]|[(]|[{]|[\\[]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) { /*Цикл на проверку корректности.
                                   Cycle to verify the correctness.*/
            if (test.empty()) {
                test.push(matcher.group());

            }

            else if (((test.peek().equals("("))&&(matcher.group().equals(")")))
                    ||((test.peek().equals("{"))&&(matcher.group().equals("}")))
                    ||((test.peek().equals("["))&&(matcher.group().equals("]")))) {
                test.pop();
            }
            else test.push(matcher.group());
        }
        if(test.empty())/*Вывод результата.
                          Printing result */
        {
            System.out.println("Корректность расстановки скобок в тексте: correct");
        }
        else System.out.println("Корректность расстановки скобок в тексте: incorrect");
    }
}
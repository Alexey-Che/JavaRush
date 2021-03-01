package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
//        String string = "мама мыла , раму.";

        //напишите тут ваш код
        String[] list = string.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String element : list) {
            if (element.isEmpty()) {
                stringBuilder.append(" ");
                continue;
            }
            String firstLetter = element.substring(0, 1).toUpperCase();
            String result = firstLetter + element.substring(1);
            stringBuilder.append(result);
            stringBuilder.append(" ");
        }
        stringBuilder.append("\b");
        System.out.println(stringBuilder.toString());
    }
}

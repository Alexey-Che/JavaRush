package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Считаем слово
*/

public class Solution {

    private static int count = 0;
    public static void main(String[] args) throws IOException {
        String fileName1;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = bufferedReader.readLine();
        }
        StringBuilder stringBuilder = new StringBuilder();

        try (FileReader fileReader = new FileReader(fileName1)) {
            char currentChar;
            while (fileReader.ready()) {
                currentChar = (char) fileReader.read();
                stringBuilder.append(currentChar);
            }
        }

        String string = stringBuilder.toString().replaceAll("\\p{Punct}", " ").replaceAll("\\s", " ");

        for (String element: string.split(" ")) {
            if (element.equals("world")) {
                count++;
            }
        }
        System.out.println(count);
    }
}

package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add(bufferedReader.readLine());
        }
        ArrayList<Integer> result = new ArrayList<>();
        int max = 0;
        for (String element : strings) {
            if (element.length() > max) {
                max = element.length();
            }
        }
        for (String element : strings) {
            if (element.length() == max) {
                result.add(strings.indexOf(element));
            }
        }
        for (Integer element : result) {
            System.out.println(strings.get(element));
        }
    }
}

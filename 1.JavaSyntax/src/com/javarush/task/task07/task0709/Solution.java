package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(bufferedReader.readLine());
        }
        ArrayList<Integer> result = new ArrayList<>();
        int min = list.get(0).length();
        for (String element : list) {
            if (element.length() < min) {
                min = element.length();
            }
        }
        for (String element : list) {
            if (element.length() == min) {
                result.add(list.indexOf(element));
            }
        }
        for (Integer element : result) {
            System.out.println(list.get(element));
        }
    }
}

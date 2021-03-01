package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            list.add(bufferedReader.readLine());
        }
        for (int i = 0; i <13 ; i++) {
            String buffer = list.get(list.size()-1);
            list.remove(list.size()-1);
            list.add(0, buffer);
        }
        list.forEach(System.out::println);
    }
}

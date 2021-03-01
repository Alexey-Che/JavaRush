package com.javarush.task.task07.task0710;

/* 
В начало списка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            list.add(0, bufferedReader.readLine());
        }
        list.forEach(System.out::println);
    }
}

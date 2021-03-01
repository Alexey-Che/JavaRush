package com.javarush.task.task07.task0702;

/* 
Массив из строчек в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        String[] list = new String[10];
        for (int i=0; i<8; i++) {
            list[i]= reader.readLine();
        }
        for (int i=0; i<list.length; i++) {
            System.out.println(list[list.length-1-i]);
        }
    }
}
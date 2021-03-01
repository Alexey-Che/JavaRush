package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] mass = new int[10];
        String[] list = new String[10];
        for (int i = 0; i < mass.length; i++) {
            list[i] = bufferedReader.readLine();
            mass[i] = list[i].length();
            System.out.println(mass[i]);
        }
    }
}

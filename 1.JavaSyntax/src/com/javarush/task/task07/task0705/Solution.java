package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] mass = new int[20];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int[] a = new int[10];
        int[] b = new int[10];
        for (int i = 0; i < mass.length; i++) {
            if (i < 10) {
                a[i] = mass[i];
            } else {
                b[i - 10] = mass[i];
                System.out.println(b[i-10]);
            }
        }
    }
}

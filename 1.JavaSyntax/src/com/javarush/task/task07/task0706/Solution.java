package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] mass = new int[15];
        int countOdd = 0;
        int countEven = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = Integer.parseInt(bufferedReader.readLine());
            if (i%2==0) {
                countEven += mass[i];
            } else {
                countOdd += mass[i];
            }
        }
        String result = countEven > countOdd ? "В домах с четными номерами проживает больше жителей." : "В домах с нечетными номерами проживает больше жителей.";
        System.out.println(result);
    }
}

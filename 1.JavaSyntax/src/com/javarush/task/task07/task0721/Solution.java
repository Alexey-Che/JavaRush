package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        //напишите тут ваш код
        int[] result = getInts();
        int maximum = result[0];
        int minimum = result[0];
        for (int i = 0; i < 20; i++) {
            if (result[i] > maximum) {
                maximum = result[i];
            }
            if (result[i] < minimum) {
                minimum = result[i];
            }
        }
        System.out.print(maximum + " " + minimum);
    }

    //напишите тут ваш код
    public static int[] getInts() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] mass = new int[20];
        for (int i = 0; i < 20; i++) {
            mass[i] = Integer.parseInt(bufferedReader.readLine());
        }
        return mass;
    }
}

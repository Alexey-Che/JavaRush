package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        int index;
        int tmp;
        for (int i = 0; i < array.length; i++) {
            index = i;
            tmp = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > tmp) {
                    tmp = array[j];
                    index = j;
                }
            }
            if (index == i)
                continue;
            tmp = array[i];
            array[i] = array[index];
            array[index] = tmp;
        }

    }
}

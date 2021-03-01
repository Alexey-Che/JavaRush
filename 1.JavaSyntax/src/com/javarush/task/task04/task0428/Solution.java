package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int[] mass = new int[3];
        int count = 0;
        for (int i = 0; i < 3; i++) {
            mass[i] = scanner.nextInt();
            if (mass[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

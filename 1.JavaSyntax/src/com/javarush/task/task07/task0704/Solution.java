package com.javarush.task.task07.task0704;

/* 
Переверни массив
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = scanner.nextInt();
        }

        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[mass.length-1-i]);
        }

    }
}


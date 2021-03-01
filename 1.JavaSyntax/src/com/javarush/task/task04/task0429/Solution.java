package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int[] mass = new int[3];
        int countPossitive = 0;
        int countNegative = 0;
        for (int i = 0; i < 3; i++) {
            mass[i] = scanner.nextInt();
            if (mass[i] > 0) {
                countPossitive++;
            }
            if (mass[i] < 0) {
                countNegative++;
            }
        }
        System.out.println("количество отрицательных чисел: " + countNegative);
        System.out.println("количество положительных чисел: " + countPossitive);
    }
}

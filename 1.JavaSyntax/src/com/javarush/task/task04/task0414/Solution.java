package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year % 400 == 0 && year % 100 == 0) {
            System.out.println("количество дней в году: 366");
        } else if (year % 100 > 0 && year % 4 == 0) {
            System.out.println("количество дней в году: 366");
        } else if (year % 100 == 0) {
            System.out.println("количество дней в году: 365");
        } else {
            System.out.println("количество дней в году: 365");
        }
    }
}
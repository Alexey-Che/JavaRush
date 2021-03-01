package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        double time = scanner.nextDouble();
        double number = time % 5;
        if (number >= 0 && number < 3) {
            System.out.println("зелёный");
        } else if (number >= 3 && number < 4) {
            System.out.println("желтый");
        } else if (number >= 4 && number < 5) {
            System.out.println("красный");
        }
    }
}
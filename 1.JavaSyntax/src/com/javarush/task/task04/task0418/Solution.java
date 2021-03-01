package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a - b < 0) {
            System.out.println(a);
        } else if (a - b > 0) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}
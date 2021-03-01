package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > 0 && b > 0) {
            System.out.println("1");
        } else if (a < 0 && b > 0) {
            System.out.println("2");
        } else if (a < 0 && b < 0) {
            System.out.println("3");
        } else if (a > 0 && b < 0) {
            System.out.println("4");
        }

    }
}

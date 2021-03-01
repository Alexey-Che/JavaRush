package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 0 && num % 2 == 0) {
            System.out.println("отрицательное четное число");
        }
        if (num % 2 == - 1) {
            System.out.println("отрицательное нечетное число");
        }
        if (num == 0) {
            System.out.println("ноль");
        }
        if (num > 0 && num % 2 == 0) {
            System.out.println("положительное четное число");
        }
        if (num % 2 == 1) {
            System.out.println("положительное нечетное число");
        }
    }
}

package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(8);

            }
            System.out.println();
        }
    }
}

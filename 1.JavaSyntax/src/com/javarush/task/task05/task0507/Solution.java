package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            sum = sum + num;
            count++;
        }
        double result = sum/count;
        System.out.println(result);
    }
}


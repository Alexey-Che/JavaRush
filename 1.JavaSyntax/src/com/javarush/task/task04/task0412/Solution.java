package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0) {
            number = number*2;
            System.out.println(number);
        } else if (number == 0) {
            System.out.println(0);
        } else {
            number++;
            System.out.println(number);
        }


    }

}
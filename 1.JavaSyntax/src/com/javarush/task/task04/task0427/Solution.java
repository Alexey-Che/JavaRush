package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String numToString = Integer.toString(num);
        if (num > 0 && num <1000) {
            if (num%2==0 && numToString.length()==1) {
                System.out.println("четное однозначное число");
            }
            if (num%2==1 && numToString.length()==1) {
                System.out.println("нечетное однозначное число");
            }
            if (num%2==0 && numToString.length()==2) {
                System.out.println("четное двузначное число");
            }
            if (num%2==1 && numToString.length()==2) {
                System.out.println("нечетное двузначное число");
            }
            if (num%2==0 && numToString.length()==3) {
                System.out.println("четное трехзначное число");
            }
            if (num%2==1 && numToString.length()==3) {
                System.out.println("нечетное трехзначное число");
            }
        }
    }
}

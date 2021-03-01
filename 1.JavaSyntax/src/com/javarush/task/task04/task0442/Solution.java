package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int a = scanner.nextInt();
            sum +=a;
            if (a==-1) {
                break;
            }
        }
        System.out.println(sum);

    }
}

package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int dayOfWeek = scanner.nextInt();
        if(dayOfWeek <1 || dayOfWeek> 7) {
            System.out.println("такого дня недели не существует");
        } else if (dayOfWeek==1) {
            System.out.println("понедельник");
        } else if (dayOfWeek==2) {
            System.out.println("вторник");
        } else if (dayOfWeek==3) {
            System.out.println("среда");
        } else if (dayOfWeek==4) {
            System.out.println("четверг");
        } else if (dayOfWeek==5) {
            System.out.println("пятница");
        } else if (dayOfWeek==6) {
            System.out.println("суббота");
        } else {
            System.out.println("воскресенье");
        }

    }
}
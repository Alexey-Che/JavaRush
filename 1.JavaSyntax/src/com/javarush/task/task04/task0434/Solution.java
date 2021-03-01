package com.javarush.task.task04.task0434;

/* 
Таблица умножения Ӏ Java Syntax: 4 уровень, 10 лекция
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int count = 1;
        while (count < 11) {
            int count1 = 1;
            while (count1 < 11) {
                System.out.print(count * count1 + " ");
                count1++;
            }
            count++;
            System.out.println();
        }
    }
}

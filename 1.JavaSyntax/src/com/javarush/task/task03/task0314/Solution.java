package com.javarush.task.task03.task0314;

/* 
Таблица умножения Ӏ Java Syntax: 3 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 1; i < 11; i++)    {
            for (int y = 1; y < 11; y++)    {
                System.out.print(i * y + " ");
            }
            System.out.println();
        }

    }
}

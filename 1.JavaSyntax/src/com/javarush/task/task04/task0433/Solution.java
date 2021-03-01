package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int count = 1;
        while (count < 11) {
            int count1 = 1;
            while (count1 < 11) {
                System.out.print("S");
                count1++;
            }
            count++;
            System.out.println();
        }

    }
}

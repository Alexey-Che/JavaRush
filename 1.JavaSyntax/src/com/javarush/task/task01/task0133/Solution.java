package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {
    public static void main(String[] args) {
        int secondsAfter15 = 0;
        double begin = 15.00;
        secondsAfter15 = (int) ((15.30 - begin)* 100) *60;
        System.out.println(secondsAfter15);
    }
}
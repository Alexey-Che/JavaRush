package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        //System.out.println("entered " + number1);
        int number2 = in.nextInt();
        //System.out.println("entered " + number2);
        System.out.println(name + " получает " + number1 + " через " + number2 + " лет.");


    }
}

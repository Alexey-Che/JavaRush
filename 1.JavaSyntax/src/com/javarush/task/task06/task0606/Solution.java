package com.javarush.task.task06.task0606;

/* 
Чётные и нечётные циферки
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String number = bufferedReader.readLine();
        int[] num = new int[number.length()];
        num = goInt(number);
        int evenNum = 0;
        int oddNum = 0;
        for (int value : num) {
            if (value % 2 == 0) {
                evenNum++;
            } else {
                oddNum++;
            }
        }
        even = evenNum;
        odd = oddNum;
        System.out.println("Even: " + even + " Odd: " + odd);
    }

    private static int[] goInt(String a) {
        int[] p = new int[a.length()];
        for (int i = 0; i < a.length(); i++) {
            p[i] = a.charAt(i) - '0';
        }
        return p;
    }
}

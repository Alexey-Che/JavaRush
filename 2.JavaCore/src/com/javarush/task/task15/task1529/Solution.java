package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        Solution.reset();
    }

    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String key = reader.readLine();
            if ("plane".equals(key)) {
                int passengers = Integer.parseInt(reader.readLine());
                result = new Plane(passengers);
            } else if ("helicopter".equals(key)) {
                result = new Helicopter();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

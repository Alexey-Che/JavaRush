package com.javarush.task.task03.task0322;

/* 
Большая и чистая
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String [] name = new String[3];
        for(int i=0; i<3;i++)   {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            name [i] = reader.readLine();
        }
        System.out.println(name[0] + " + " + name[1] + " + " + name[2] + " = Чистая любовь, да-да!");

    }
}
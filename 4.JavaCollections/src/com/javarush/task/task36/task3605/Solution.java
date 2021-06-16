package com.javarush.task.task36.task3605;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;


/* 
Использование TreeSet
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        TreeSet<Character> set = new TreeSet<>();
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String s;
        while ((s = reader.readLine()) != null) {
            for (char element : s.toLowerCase().toCharArray()) {
                if (element >= 97 && element <= 122) {
                    set.add(element);
                }
            }
        }
        int count = 0;
        for (Character element : set) {
            System.out.print(element);
            count++;
            if (count == 5) {
                break;
            }
        }
    }
}

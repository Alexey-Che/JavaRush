package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ArrayList<String> newString = new ArrayList<>();
        for (String string : strings) {
            if (string.contains("р") && string.contains("л")) {
                newString.add(string);
            }
            if (string.contains("р")) {
                continue;
            }
            if (string.contains("л") && !string.contains("р")) {
                newString.add(string);
                newString.add(string);
            } else {
                newString.add(string);
            }
        }
        return newString;
    }
}
package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(12, "двенадцать");
        map.put(11, "одиннадцать");
        map.put(10, "десять");
        map.put(9, "девять");
        map.put(8, "восемь");
        map.put(7, "семь");
        map.put(6, "шесть");
        map.put(5, "пять");
        map.put(4, "четыре");
        map.put(3, "три");
        map.put(2, "два");
        map.put(1, "один");
        map.put(0, "ноль");
    }

    public static void main(String[] args) {
        String fileName = null;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        } catch (IOException ignore) {
            /* NOP */
        }
        String fileLine;
        ArrayList<String> fileContent = new ArrayList<>();

        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            while ((fileLine = in.readLine()) != null) {
                fileContent.add(fileLine);
            }
        } catch (IOException ignore) {
            /* NOP */
        }
        for (String line : fileContent) {
            String[] splitedLine = line.split(" ");
            for (int i = 0; i < splitedLine.length; i++) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    try {
                        int number = Integer.parseInt(splitedLine[i]);
                        if (entry.getKey().equals(number))
                            splitedLine[i] = entry.getValue();
                    } catch (NumberFormatException ignored) {
                        /*NOP*/
                    }
                }
            }
            StringBuffer sbLine = new StringBuffer();
            for (String word : splitedLine) {
                sbLine.append(word).append(" ");
            }
            System.out.println(sbLine.toString().trim());
        }
    }
}

package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

//        int id = Integer.parseInt(reader.readLine());
//        String name = reader.readLine();
        while (true) {
            String string = reader.readLine();
            if (string.isEmpty()) {
                break;
            }
            int id = Integer.parseInt(string);
            String name = reader.readLine();
            map.put(name, id);
        }
//        System.out.println("Id=" + id + " Name=" + name);
        for (Map.Entry<String, Integer> pair: map.entrySet()) {
            String string = pair.getKey();
            int value = pair.getValue();
            System.out.println(value + " " + string);
        }
    }
}

package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //List<String> list = new ArrayList<>();
        Map<String,String> mapList = new HashMap<>();
        while (true) {
            String сity = reader.readLine();
            if (сity.isEmpty()) {
                break;
            }
            String family = reader.readLine();
            mapList.put(сity,family);
        }

        // Read the sity
        //System.out.println("Введите город");
        String сityNumber = reader.readLine();

        System.out.println(mapList.get(сityNumber));
    }
}

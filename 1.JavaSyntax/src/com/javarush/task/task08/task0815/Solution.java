package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("fdsfsd", "100");
        map.put("fdsfsd1", "200");
        map.put("fdsfsd2", "300");
        map.put("fdsfsd3", "400");
        map.put("fdsfsd4", "500");
        map.put("fdsfsd5", "600");
        map.put("fdsfsd6", "700");
        map.put("fdsfsd7", "800");
        map.put("fdsfsd8", "900");
        map.put("fdsfsd9", "1000");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> element: map.entrySet()
        ) {
            if (element.getValue().equals(name)) {
                count++;
            }

        }
        return count;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> element: map.entrySet()
        ) {
            if (element.getKey().equals(lastName)) {
                count++;
            }

        }
        return count;


    }

    public static void main(String[] args) {

    }
}

package com.javarush.task.task08.task0806;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

/* 
Коллекция Map из Object
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", 56L);
        map.put("Food", '3');
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        //напишите тут ваш код
        for (Map.Entry<String, Object> element: map.entrySet()
             ) {
            String key = element.getKey();
            Object value = element.getValue();
            System.out.println(key + " - " + value);
        }
    }
}

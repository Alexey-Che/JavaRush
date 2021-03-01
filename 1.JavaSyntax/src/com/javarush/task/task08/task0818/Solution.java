package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("fdsfsd", 100);
        map.put("fdsfsd1", 200);
        map.put("fdsfsd2", 300);
        map.put("fdsfsd3", 400);
        map.put("fdsfsd4", 500);
        map.put("fdsfsd5", 600);
        map.put("fdsfsd6", 700);
        map.put("fdsfsd7", 800);
        map.put("fdsfsd8", 900);
        map.put("fdsfsd9", 1000);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            int zp = pair.getValue();
            if (zp < 500)
                iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}
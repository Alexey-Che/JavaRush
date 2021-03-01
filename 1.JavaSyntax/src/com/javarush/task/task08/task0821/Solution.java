package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Лысенков","Павел");
        map.put("Динара","Альгужина");
        map.put("Хмелев","Сергей");
        map.put("Лысенков1","Илья");
        map.put("Козлов","Алекснадр");
        map.put("Никифоров","Илья");
        map.put("Петасова","Илья");
        map.put("Хмелев","Николай");
        map.put("Соловьев","Иван");
        map.put("Ибрагимов","Ролан");
        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}

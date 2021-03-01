package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Лысенков","Павел");
        map.put("Динара","Альгужина");
        map.put("Хмелев","Сергей");
        map.put("Лысенков1","Илья");
        map.put("Козлов","Алекснадр");
        map.put("Никифоров","Илья");
        map.put("Петасова","Ангелина");
        map.put("Коваленко","Николай");
        map.put("Соловьев","Иван");
        map.put("Ибрагимов","Ролан");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

        ArrayList<String> values = new ArrayList<String>();
        ArrayList<String> valuesDuplicates = new ArrayList<String>();

        Iterator<String> iterator = map.values().iterator();

        while (iterator.hasNext()) {

            String nameCheckDupl = iterator.next();

            if (values.contains(nameCheckDupl)) {

                valuesDuplicates.add(nameCheckDupl);

            } else {

                values.add(nameCheckDupl);

            }

        }

        System.out.println(map); //вывод на экран для проверки

        for (int j = 0; j < valuesDuplicates.size(); j++) {

            String val = valuesDuplicates.get(j);

            removeItemFromMapByValue(map, val);

        }

        System.out.println(map); //вывод на экран для проверки

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {



    }
}

package com.javarush.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String key: params.keySet()){
            if (params.get(key) != null) {
                stringBuilder.append(String.format("%s = '%s' and ", key, params.get(key)));
            }
        }
        if (stringBuilder.length()> 0) return stringBuilder.substring(0, stringBuilder.length()-5);
        return "";
    }
}

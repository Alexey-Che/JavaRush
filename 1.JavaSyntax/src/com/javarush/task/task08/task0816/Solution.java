package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне1", dateFormat.parse("JUN 1 2012"));
        map.put("Сталлоне2", dateFormat.parse("JUL 1 2012"));
        map.put("Сталлоне3", dateFormat.parse("JUL 1 2012"));
        map.put("Сталлоне4", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне5", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне6", dateFormat.parse("AUG 1 2012"));
        map.put("Сталлон7", dateFormat.parse("MAY 1 2012"));
        map.put("Стал5555лоне", dateFormat.parse("FEB 1 2012"));
        map.put("Сталл32131оне", dateFormat.parse("AUG 1 2012"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<String, Date> entry = iterator.next();
            if(entry.getValue().getMonth()==5||entry.getValue().getMonth()==6||entry.getValue().getMonth()==7)
                iterator.remove();
        }

    }

    public static void main(String[] args) throws ParseException {
        Map <String, Date> map =  Solution.createMap();
        Solution.removeAllSummerPeople(map);
    }
}

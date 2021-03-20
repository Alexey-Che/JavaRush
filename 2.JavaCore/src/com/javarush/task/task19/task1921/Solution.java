package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.ready()) {
                list.add(reader.readLine());
            }
        }

        for (String element : list) {
            String[] str = element.split(" ");
            Pattern pattern = Pattern.compile("^\\D+");
            StringBuilder stringBuilder = new StringBuilder();
            for (String word : str) {
                Matcher matcher = pattern.matcher(word);
                if (matcher.find()) {
                    stringBuilder.append(word + " ");
                }
            }
            String name = stringBuilder.toString().trim();
            Calendar calendar = new GregorianCalendar(Integer.parseInt(str[str.length - 1]), Integer.parseInt(str[str.length - 2]) - 1, Integer.parseInt(str[str.length - 3]));
            Date date = calendar.getTime();
            PEOPLE.add(new Person(name, date));
        }
    }
}

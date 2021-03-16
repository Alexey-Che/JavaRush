package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName1;
        String fileName2;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = bufferedReader.readLine();
            fileName2 = bufferedReader.readLine();
        }

        ArrayList<String> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName1))) {
            while (reader.ready()) {
                String[] strings = reader.readLine().split(" ");
                for (String element: strings) {
                    list.add(element.trim());
                }
            }
        }



        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {
            Pattern number = Pattern.compile("\\b\\d+\\b");
            for (String element: list) {
                Matcher matcher = number.matcher(element);
                if (matcher.find()) {
                    writer.write(matcher.group()+ " ");
                }
            }
        }
    }
}

package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String reader = bufferedReader.readLine();
        String parameters = reader.substring(reader.lastIndexOf("?") + 1);
        String[] splitParameters = parameters.split("&");
        String obj = null;

        StringBuilder result = new StringBuilder();
        for (String string : splitParameters) {
            String[] param = string.split("=");
            result.append(param[0]);
            result.append(" ");

            if (param[0].equals("obj")) {
                obj = param[1];
            }
        }

        System.out.println(result.toString().trim());

        if (obj != null) {
            try {
                alert(Double.parseDouble(obj));
            } catch (Exception e) {
                alert(obj);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}

package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        try {
            for (int i = 0; i < 10; i++) {
                list.add(Integer.parseInt(reader.readLine()));
            }

        } catch (NumberFormatException | IOException e) {
            for (Integer element : list
            ) {
                System.out.println(element);
            }
        }
    }
}

package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(bufferedReader.readLine());
        }
        int maxIndex = 0;
        int minIndex = 0;
        int max = list.get(0).length();
        int min = list.get(0).length();
        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() < min) {
                min = list.get(i).length();
            }
            if (list.get(i).length() > max) {
                max = list.get(i).length();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == max) {
                maxIndex = i;
                break;
            }
            if (list.get(i).length() == min) {
                minIndex = i;
                break;
            }
        }
        if (maxIndex < minIndex) {
            System.out.println(list.get(minIndex));
        } else {
            System.out.println(list.get(maxIndex));
        }
    }
}


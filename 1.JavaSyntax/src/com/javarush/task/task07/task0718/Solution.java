package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(bufferedReader.readLine());
        }
        int li = list.size();
        for (int i = 0; i < li - 1; i++) {
            if (list.get(i).length() > list.get(i + 1).length()) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}


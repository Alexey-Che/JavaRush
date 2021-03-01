package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int maxCount = 1;
        int count = 1;
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i-1).equals(list.get(i))) {
                count++;
                if (count> maxCount) {
                    maxCount = count;
                }
            } else {
                count = 1;
            }
        }
        System.out.println(maxCount);
    }
}
package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int[] bytes = new int[256];

        while (fileInputStream.available() > 0) {
            bytes[fileInputStream.read()] += 1;
        }
        fileInputStream.close();
        int minCount = Integer.MAX_VALUE;
        for (int element : bytes) {
            if (element > 0 && element < minCount) {
                minCount = element;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < bytes.length ; i++) {
            if (bytes [i] == minCount) {
                list.add(i);
            }
        }
        for (Integer element : list) {
            System.out.print(element + " ");
        }
    }
}

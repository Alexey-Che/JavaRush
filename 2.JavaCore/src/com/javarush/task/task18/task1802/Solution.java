package com.javarush.task.task18.task1802;

import java.io.*;
import java.sql.Struct;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        int min = 255;
        FileInputStream fileInputStream = new FileInputStream(fileName);
        while (fileInputStream.available()>0) {
            int currentByte = fileInputStream.read();
            if (currentByte< min) {
                min = currentByte;
            }
        }
        fileInputStream.close();
        System.out.println(min);
    }
}

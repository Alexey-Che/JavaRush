package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();


        try (FileInputStream fileReader = new FileInputStream(fileName1);
             FileInputStream fileReader1 = new FileInputStream(fileName2)) {
            while (fileReader1.available()>0) {
                byteArrayOutputStream.write(fileReader1.read());
            }

            while (fileReader.available()>0) {
                byteArrayOutputStream.write(fileReader.read());
            }
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName1)) {
            byteArrayOutputStream.writeTo(fileOutputStream);
        }
    }
}

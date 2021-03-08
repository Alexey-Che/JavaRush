package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String readString;
        while (!(readString = bufferedReader.readLine()).equals("exit")) {
            ReadThread readThread = new ReadThread(readString);
            readThread.start();
        }

    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }

        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run() {
            byte[] bytes = new byte[256];
            try (FileInputStream fileInputStream = new FileInputStream(fileName)) {

                while (fileInputStream.available() > 0) {
                    bytes[fileInputStream.read()]++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            int maxCount = 0;
            int maxCountByte = 0;
            for (int i = 0; i < bytes.length; i++) {
                if (bytes[i] > maxCount) {
                    maxCount = bytes[i];
                    maxCountByte = i;
                }
            }
            resultMap.put(fileName, maxCountByte);
        }
    }
}

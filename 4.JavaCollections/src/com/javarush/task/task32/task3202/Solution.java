package com.javarush.task.task32.task3202;

import java.io.*;

/* 
Читаем из потока
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("testFile.log"));
        System.out.println(writer.toString());
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) throws IOException {
        StringWriter writer = new StringWriter();
        if (is != null) {
            char[] list = new char[1024];
            try (Reader reader = new BufferedReader(new InputStreamReader(is))) {
                int len;
                while ((len = reader.read(list)) != -1) {
                    writer.write(list, 0, len);
                }
            }
        }
        return writer;
    }
}

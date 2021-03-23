package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.StandardCharsets;

/* 
Смена кодировки
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (BufferedReader inputStreamReader = new BufferedReader(new InputStreamReader (new FileInputStream(args[0]), "Windows-1251"));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[1]), StandardCharsets.UTF_8))) {
            String str;
            while (inputStreamReader.ready()) {
                str = inputStreamReader.readLine();
                writer.write(str);
            }
        }
    }
}

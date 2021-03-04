package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file = bufferedReader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        String line;
        do {
            writer.write(line = bufferedReader.readLine());
            writer.newLine();
        } while (!line.equals("exit"));
        writer.close();
    }
}

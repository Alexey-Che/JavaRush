package com.javarush.task.task18.task1822;

import java.io.*;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()))) {
            while (bufferedReader.ready()) {
                String string = bufferedReader.readLine();
                if (string.startsWith(args[0] + " ")) {
                    System.out.println(string);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

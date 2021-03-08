package com.javarush.task.task18.task1821;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) {
        int[] ASCII = new int[128];

        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                ASCII[fileReader.read()]++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < ASCII.length; i++) {
            if (ASCII[i]!= 0) {
                System.out.println((char) i + " " + ASCII[i]);
            }
        }
    }
}

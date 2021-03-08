package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) {

        switch (args[0]) {

            case "-e" :
                try {
                    FileInputStream fileInputStream = new FileInputStream(args[1]);
                    FileOutputStream fileOutputStream = new FileOutputStream(args[2]);
                    while (fileInputStream.available() > 0) {
                        fileOutputStream.write(fileInputStream.read() + 32);
                    }
                    fileInputStream.close();
                    fileOutputStream.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                break;
            case "-d" :
                try {
                    FileInputStream fileInputStream = new FileInputStream(args[1]);
                    FileOutputStream fileOutputStream = new FileOutputStream(args[2]);
                    while (fileInputStream.available() > 0) {
                        fileOutputStream.write(fileInputStream.read() - 32);
                    }
                    fileInputStream.close();
                    fileOutputStream.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}

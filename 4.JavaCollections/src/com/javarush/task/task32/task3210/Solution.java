package com.javarush.task.task32.task3210;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) {
        try (RandomAccessFile raf = new RandomAccessFile(args[0], "rw")) {
            raf.seek(Long.parseLong(args[1]));
            byte[] buffer = new byte[args[2].length()];
            raf.read(buffer, 0, args[2].length());
            String str = new String(buffer);
            raf.seek(raf.length());
            if (args[2].equals(str)) {
                raf.write("true".getBytes(StandardCharsets.UTF_8));
            } else {
                raf.write("false".getBytes(StandardCharsets.UTF_8));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

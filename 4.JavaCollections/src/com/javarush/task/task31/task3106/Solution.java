package com.javarush.task.task31.task3106;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import java.util.zip.ZipInputStream;

/* 
Разархивируем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Set<String> source = new TreeSet<>(Arrays.asList(args).subList(1, args.length));
        Vector<InputStream> streams = new Vector<>();
        for (String element: source) {
            streams.add(Files.newInputStream(Paths.get(element)));
        }
        try (FileOutputStream fos = new FileOutputStream(args[0]);
        ZipInputStream zis = new ZipInputStream(new SequenceInputStream(streams.elements()))) {
            while (zis.getNextEntry() != null) {
                byte [] buffer = new byte[4048];
                int read = 0;
                while ((read = zis.read(buffer)) != -1) {
                    fos.write(buffer, 0, read);
                }
            }
        }
    }
}

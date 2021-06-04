package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* 
Что внутри папки?
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String folder = reader.readLine();
        Path path = Paths.get(folder);
        if (!Files.isDirectory(path)) {
            System.out.println(path.toString() + " - не папка");
        } else {
            AtomicInteger countFolders = new AtomicInteger();
            AtomicInteger countFiles = new AtomicInteger();
            AtomicLong totalSize = new AtomicLong();

            Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    countFiles.incrementAndGet();
                    totalSize.addAndGet(attrs.size());
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                    if (!dir.equals(path)) {
                        countFolders.incrementAndGet();
                    }
                    return FileVisitResult.CONTINUE;
                }
            });

            System.out.println("Всего папок - " + countFolders);
            System.out.println("Всего файлов - " + countFiles);
            System.out.println("Общий размер - " + totalSize);
        }
    }
}

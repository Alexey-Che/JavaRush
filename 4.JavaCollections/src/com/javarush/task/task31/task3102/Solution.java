package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Находим все файлы
*/

public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
//        Stream<Path> walk = null;
//        return walk
//                .filter(Files::isRegularFile)
//                .map(Path::toString)
//                .collect(Collectors.toList());

        Queue<File> queue = new LinkedList<>();
        List<String> list = new ArrayList<>();
        File file = new File(root);
        if (file.isDirectory()) {
            queue.offer(file);
        }
        while (!queue.isEmpty()) {
            File tmp = queue.poll();
            for (File element : Objects.requireNonNull(tmp.listFiles())) {
                if (element.isDirectory()) {
                    queue.offer(element);
                } else {
                    list.add(element.getPath());
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {

    }
}

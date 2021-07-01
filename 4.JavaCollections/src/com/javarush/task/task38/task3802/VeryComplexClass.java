package com.javarush.task.task38.task3802;

/* 
Проверяемые исключения (checked exception)
*/

import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.file.Path;

public class VeryComplexClass {
    public void veryComplexMethod() throws Exception {
        //напишите тут ваш код
        FileInputStream inputStream = new FileInputStream(String.valueOf(new FileReader("C:\\text.txt)")));
    }

    public static void main(String[] args) {

    }
}

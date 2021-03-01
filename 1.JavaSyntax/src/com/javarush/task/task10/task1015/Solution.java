package com.javarush.task.task10.task1015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Массив списков строк
Создай массив, элементами которого будут списки строк.
Заполни массив любыми данными и выведи их на экран.


Требования:
1. Метод createList должен объявлять и инициализировать массив с типом элементов ArrayList<String>.
2. Метод createList должен возвращать созданный массив.
3. Метод createList должен добавлять в массив элементы (списки строк). Списки должны быть не пустые.
4. Программа должна выводить данные на экран.
5. Метод main должен вызывать метод createList.
6. Метод main должен вызывать метод printList.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() throws IOException {
        //напишите тут ваш код
        ArrayList<String>[] listMassive = new ArrayList[2];
        for (int i = 0; i < listMassive.length; i++) {
            ArrayList<String> list = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                list.add("hello");
            }
            listMassive[i] = list;
        }
        return listMassive;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
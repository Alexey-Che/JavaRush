package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут
        Collections.sort(array);
        return array.get(0);




    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int N = Integer.parseInt(buf.readLine());

        for (int i = 0 ; i<N; i++){
            int y = Integer.parseInt(buf.readLine());
            list.add(y);
        }
        return list;
    }
}

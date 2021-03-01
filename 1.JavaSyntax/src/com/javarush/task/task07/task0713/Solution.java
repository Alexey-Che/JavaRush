package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> all = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }
        for (Integer element : list
        ) {
            if (element % 3 == 0 && element % 2 == 0) {
                three.add(element);
                two.add(element);
            } else if (element % 3 == 0) {
                three.add(element);
            } else if (element % 2 == 0) {
                two.add(element);
            } else {
                all.add(element);
            }
        }
        printList(three);
        printList(two);
        printList(all);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        list.forEach(System.out::println);
    }
}

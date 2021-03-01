package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        list.add("113213");
        list.add("113213123");
        list.add("1132312313");
        list.add("113211233");
        list.add("113211231233");
        System.out.println(list.size());
        list.forEach(System.out::println);
    }
}

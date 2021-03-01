package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        Iterator<Cat> it = cats.iterator();
        it.next();
        it.remove();

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        cat1.name = "1";
        cat2.name = "2";
        cat3.name = "3";
        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat out : cats)
            System.out.println(out);
    }

    // step 1 - пункт 1
    public static class Cat {
        public String name;
    }
}

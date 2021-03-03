package com.javarush.task.task12.task1225;

/* 
Посетители
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
        Map<Class<?>, String> classes = new HashMap<>();
        classes.put(Cat.class, "Кот");
        classes.put(Tiger.class, "Тигр");
        classes.put(Lion.class, "Лев");
        classes.put(Bull.class, "Бык");
        classes.put(Cow.class, "Корова");
        classes.put(Animal.class, "Животное");

        return classes.get(o.getClass());
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}

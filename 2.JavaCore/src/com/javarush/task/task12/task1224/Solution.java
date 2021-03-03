package com.javarush.task.task12.task1224;

/* 
Неведома зверушка
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
        Map<Class<?>, String> classes = new HashMap<>();
        classes.put(Cat.class, "Кот");
        classes.put(Tiger.class, "Тигр");
        classes.put(Lion.class, "Лев");
        classes.put(Bull.class, "Бык");

        return classes.getOrDefault(o.getClass(), "Животное");
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}

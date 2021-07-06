package com.javarush.task.task38.task3812;

/* 
Обработка аннотаций
*/

public class Solution {
    public static void main(String[] args) {
        printFullyQualifiedNames(Solution.class);
        printFullyQualifiedNames(SomeTest.class);

        printValues(Solution.class);
        printValues(SomeTest.class);
    }

    public static boolean printFullyQualifiedNames(Class c) {
        try {
            PrepareMyTest test = (PrepareMyTest) c.getAnnotation(PrepareMyTest.class);
            for (String element: test.fullyQualifiedNames()) {
                System.out.println(element);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static boolean printValues(Class c) {
        try {
            PrepareMyTest test = (PrepareMyTest) c.getAnnotation(PrepareMyTest.class);
            for (Class clazz: test.value()) {
                System.out.println(clazz);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}

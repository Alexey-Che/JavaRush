package com.javarush.task.task08.task0820;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();
        Set<Object> pets = join(cats, dogs);

        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs() {

        Set<Dog> result = new HashSet<Dog>();
        Dog dog = new Dog();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Collections.addAll(result, dog, dog1, dog2);
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {

        Iterator itr = pets.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static class Cat {}
    public static class Dog {}
}

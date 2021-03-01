package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat ("1",12, 10, 5);
        Cat cat2 = new Cat ("2",11, 11, 6);
        Cat cat3 = new Cat ("3",13, 12, 8);
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat3));
        System.out.println(cat3.fight(cat1));
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }



    }
}

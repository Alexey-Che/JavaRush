package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandfather1 = new Human("Вася", true, 61);
        Human grandfather2 = new Human("John", true, 67);
        Human grandmother1 = new Human("Olya", false, 56);
        Human grandmother2 = new Human("Helga", false, 59);
        Human mother = new Human("Dasha", false, 45, grandfather1, grandmother2);
        Human father = new Human("Yasha", true, 46, grandfather2, grandmother1);
        Human children1 = new Human("Kolya", true, 14, father, mother);
        Human children2 = new Human("Anna", false, 15, father, mother);
        Human children3 = new Human("Lesha", true, 13, father, mother);

        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(children1);
        System.out.println(children2);
        System.out.println(children3);
    }

    public static class Human {
        // напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
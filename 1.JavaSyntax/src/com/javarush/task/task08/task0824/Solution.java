package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> children = new ArrayList<>();
        children.add(new Human("Child1", true, 12));
        children.add(new Human("Child2", true, 10));
        children.add(new Human("Child3", false, 7));

        ArrayList<Human> father = new ArrayList<>();
        Human fathe = new Human("Father", true, 44, children);
        father.add(fathe);

        ArrayList<Human> mother = new ArrayList<>();
        Human mothe = new Human("Mother", false, 34, children);
        mother.add(mothe);

        ArrayList<Human> granny = new ArrayList<>();
        Human grandMa1 = new Human("GrandMa1", false, 68, father);
        granny.add(grandMa1);
        Human grandMa2 = new Human("GrandMa2", false, 66, mother);
        granny.add(grandMa2);
        Human grandPa1 = new Human("GrandPa1", true, 78, father);
        granny.add(grandPa1);
        Human grandPa2 = new Human("GrandPa2", true, 74, mother);
        granny.add(grandPa2);

        ArrayList<Human> family = new ArrayList<>();
        family.addAll(children);
        family.addAll(father);
        family.addAll(mother);
        family.addAll(granny);

        for (Human element: family
             ) {
            System.out.println(element);
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            children = new ArrayList<>();
        }

        Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}

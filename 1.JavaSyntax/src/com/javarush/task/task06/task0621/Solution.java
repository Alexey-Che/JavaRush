package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String dedaname = reader.readLine();
        Cat catded = new Cat(dedaname);

        String babaname = reader.readLine();
        Cat catbaba = new Cat(babaname);

        String fatername = reader.readLine();
        Cat catfather = new Cat(fatername, null, catded);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catbaba, null);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catfather);

        String sonname = reader.readLine();
        Cat catson = new Cat(sonname, catMother, catfather);


        System.out.println(catded);
        System.out.println(catbaba);
        System.out.println(catfather);
        System.out.println(catMother);
        System.out.println(catDaughter);
        System.out.println(catson);


    }

    public static class Cat {
        private final String name;
        private Cat parent1;
        private Cat parent2;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent1, Cat parent2) {
            this.name = name;
            this.parent1 = parent1;
            this.parent2 = parent2;
        }


        @Override
        public String toString() {
            if (parent1 == null && parent2 == null)
                return "The cat's name is " + name + ", no mother, no father";

            else if (parent1 == null)
                return "The cat's name is " + name + ", no mother, father is " + parent2.name;

            else if (parent2 == null)
                return "The cat's name is " + name + ", mother is " + parent1.name + ", no father";
            else
                return "The cat's name is " + name + ", mother is " + parent1.name + ", father is " + parent2.name;
        }
    }

}

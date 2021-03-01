package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private int a1, a2, a3;
        private String name;
        private double height;
        private float weight;

        public Human(int a1) {
            this.a1 = a1;
        }

        public Human(int a1, int a2) {
            this.a1 = a1;
            this.a2 = a2;
        }

        public Human(int a1, int a2, int a3) {
            this.a1 = a1;
            this.a2 = a2;
            this.a3 = a3;
        }
        public Human() {

        }

        public Human(int a1, int a2, int a3, String name) {
            this.a1 = a1;
            this.a2 = a2;
            this.a3 = a3;
            this.name = name;
        }

        public Human(int a1, int a2, int a3, String name, double height) {
            this.a1 = a1;
            this.a2 = a2;
            this.a3 = a3;
            this.name = name;
            this.height = height;
        }

        public Human(int a1, int a2, int a3, String name, double height, float weight) {
            this.a1 = a1;
            this.a2 = a2;
            this.a3 = a3;
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        public Human(int a1, String name) {
            this.a1 = a1;
            this.name = name;
        }

        public Human(int a1, double height) {
            this.a1 = a1;
            this.height = height;
        }

        public Human(int a1, float weight) {
            this.a1 = a1;
            this.weight = weight;
        }
    }
}

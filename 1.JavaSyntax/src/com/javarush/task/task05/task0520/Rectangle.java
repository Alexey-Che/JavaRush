package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    private int top;
    private int left;
    private int height;
    private int width;

    public Rectangle(int top, int left, int height, int width) {
        this.top = top;
        this.left = left;
        this.height = height;
        this.width = width;
    }

    public Rectangle(int top, int left, int height) {
        this.top = top;
        this.left = left;
        this.height = height;

    }

    public Rectangle(int top, int left) {
        this.top = top;
        this.left = left;

    }
    public Rectangle(int top) {
        this.top = top;
    }

    public static void main(String[] args) {

    }
}

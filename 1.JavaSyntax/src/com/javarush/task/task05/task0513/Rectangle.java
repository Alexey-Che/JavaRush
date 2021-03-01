package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    private int top;
    private int left;
    private int height;
    private int width;

    public int getTop() {
        return top;
    }

    public void initialize(int top) {
        this.top = top;
    }

    public int getLeft() {
        return left;
    }

    public void initialize(int left, int top) {
        this.left = left;
    }

    public int getHeight() {
        return height;
    }

    public void initialize(int height, int left, int top) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void initialize(int width, int height, int left, int top) {
        this.width = width;
    }

    public static void main(String[] args) {

    }
}

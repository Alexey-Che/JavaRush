package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int num = scanner.nextInt();

        while (num > 0) {
            System.out.println(string);
            num--;
        }
    }
}

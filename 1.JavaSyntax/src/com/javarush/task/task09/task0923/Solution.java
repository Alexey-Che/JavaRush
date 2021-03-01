package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String string = new BufferedReader(new InputStreamReader(System.in)).readLine().replace(" ", "");
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for (Character element: string.toCharArray()) {
            if (isVowel(element)) {
                a.append(element).append(" ");
            } else {
                b.append(element).append(" ");
            }
        }
        System.out.println(a);
        System.out.println(b);

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}
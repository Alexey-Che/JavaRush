package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a==b || b==c ) {
            System.out.println(b);
        } else  if (b==c || a==c) {
            System.out.println(a);
        }
        else if (a< b && a>c) {
            System.out.println(a);
        } else if (b>a && b<c) {
            System.out.println(b);
        } else if (b>c && b<a) {
            System.out.println(b);
        } else if (a>b && a<c) {
            System.out.println(a);
        } else {
            System.out.println(c);
        }

    }
}

package com.javarush.task.task04.task0419;

/*
Максимум четырех чисел
*/

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int[] num = new int[4];
        for (int i = 0; i < 4; i++) {
            num[i] = scanner.nextInt();
        }
        bubbleSort(num);
        if (num[2]==num[3]) {
            System.out.println(num[2]);
        } else {
            System.out.println(num[3]);
        }

        //System.out.println(max);
    }

    public static void bubbleSort(int[] arr){
    /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами */
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
}
}

package com.javarush.task.task09.task0930;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //String[] mas = new String[] {"6", "Winter", "1", "Autumn", "Spring", "5"};
        // 6, "Autumn", 5, "Spring", "Winter", 1

/*        [Вишня, 1, Боб, 3, Яблоко, 22, 0, Арбуз]
          [Арбуз, 22, Боб, 3, Вишня, 1, 0, Яблоко]
*/

        String[] mas = new String[]{"Вишня", "1", "Боб", "3", "Яблоко", "22", "0", "Арбуз"};

        System.out.println(Arrays.toString(mas));

        String[] sortedResult = sort(mas);
        System.out.println(Arrays.toString(sortedResult));
    }


    public static String[] sort(String[] mas) {
        Boolean[] isNumberArray = new Boolean[mas.length];
        List<Integer> numberList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < mas.length; i++) {
            String element = mas[i];
            boolean isNumber = isNumber(element);
            isNumberArray[i] = isNumber;
            if (isNumber) {
                numberList.add(Integer.valueOf(element));
            } else {
                stringList.add(element);
            }
        }
        //todo change to bubble sort
        Collections.sort(numberList, Collections.reverseOrder());
        Collections.sort(stringList);
        //

        Integer[] numberArray = numberList.toArray(new Integer[0]);
        String[] stringArray = stringList.toArray(new String[0]);


        String[] result = new String[mas.length];
        int n = 0;
        int s = 0;

        for (int i = 0; i < isNumberArray.length; i++) {
            String element = null;
            if (isNumberArray[i]) {
                element = String.valueOf(numberArray[n++]);
            } else {
                element = stringArray[s++];
            }
            result[i] = element;
        }
        return result;
    }


    public static void bubbleSort(String[] arr) {
        boolean isNumberArray = isNumber(arr[0]);
    /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
                boolean needSwap = isNumberArray ?
                        Integer.parseInt(arr[j + 1]) > Integer.parseInt(arr[j])
                        :
                        compareTo(arr[j], arr[j + 1]);

                if (needSwap) {
                    String tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }


    public static boolean compareTo(String a, String b) {
        return a.compareTo(b) > 0;
    }

    public static boolean isNumber(String s) {
        try {
            int number = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

}

  /*  public static String[] sort(String[] mas) {
        for (int i = mas.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                String a = mas[j];
                String b = mas[j + 1];
                boolean isNumberA = isNumber(a);
                boolean isNumberB = isNumber(b);

                boolean needSwap = false;
                if (isNumberA && isNumberB) {
                    needSwap = Integer.parseInt(b) > Integer.parseInt(a);
                } else if (!isNumberA && !isNumberB) {
                    needSwap = compareTo(a, b);
                } else {
                    //isSorted = false;
                }
                if (needSwap) {
                    //isSorted = false;
                    String tmp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = tmp;
                }
            }
        }

        return mas;
    }*/

   /* public static String[] sort(String[] mas) {
          for (int i = mas.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                String a = mas[j];
                String b = mas[j + 1];
                boolean isNumberA = isNumber(a);
                boolean isNumberB = isNumber(b);

                boolean needSwap = false;
                if (isNumberA && isNumberB) {
                    needSwap = Integer.parseInt(b) > Integer.parseInt(a);
                } else if (!isNumberA && !isNumberB) {
                    needSwap = compareTo(a, b);
                } else {
                    //isSorted = false;
                }
                if (needSwap) {
                    //isSorted = false;
                    String tmp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = tmp;
                }
            }
        }

        return mas;
    }*/


   /* public static String[] sort(String[] mas) {
        boolean isSorted = false;
        String buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                String a = mas[i];
                String b = mas[i + 1];
                boolean isNumberA = isNumber(a);
                boolean isNumberB = isNumber(b);

                boolean needSwap = false;
                if (isNumberA && isNumberB) {
                    needSwap = Integer.valueOf(b) > Integer.valueOf(a);
                } else if (!isNumberA && !isNumberB) {
                    needSwap = compareTo(a, b);
                } else {
                    isSorted = false;
                }
                if (needSwap) {
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
        return mas;
    }
*/
   /*public static String[] sort(String[] mas) {

       boolean isSorted = false;
       String buf;
       while (!isSorted) {
           isSorted = true;
           for (int i = 0; i < mas.length - 1; i++) {
               if (mas[i] > mas[i + 1]) {
                   isSorted = false;
                   buf = mas[i];
                   mas[i] = mas[i + 1];
                   mas[i + 1] = buf;
               }
           }
       }


       return mas;
   }*/



//}
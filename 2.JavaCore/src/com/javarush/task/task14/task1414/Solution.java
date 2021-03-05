package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String key = null;
        while ((key = reader.readLine()) != null) {
            Movie movie = MovieFactory.getMovie(key);
            if (movie == null) {
                return;
            }
            System.out.println(movie.getClass().getSimpleName());
        }


        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;
            switch (key) {
                case "soapOpera":
                    movie = new SoapOpera();
                    break;
                case "cartoon":
                    movie = new Cartoon();
                    break;
                case "thriller":
                    movie = new Thriller();
                    break;
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }

    //Напишите тут ваши классы, пункт 3
}

package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String string = fileScanner.nextLine();
            String [] split = string.split(" ");
            Calendar calendar = new GregorianCalendar(Integer.parseInt(split[5]), Integer.parseInt(split[4])-1, Integer.parseInt(split[3]));
            Date date = calendar.getTime();
            Person person = new Person(split[1], split[2], split[0], date);
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}

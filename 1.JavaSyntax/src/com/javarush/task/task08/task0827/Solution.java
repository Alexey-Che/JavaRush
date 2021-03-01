package com.javarush.task.task08.task0827;

/* 
Работа с датой
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Solution {
    public static void main(String[] args) {
        System.out.println(" = " + isDateOdd("MAY 1 2013"));
//        System.out.println(" = " + isDateOdd("JANUARY 2 2000"));
//        System.out.println(" = " + isDateOdd("JANUARY 2 2020"));
//        System.out.println(isDateOdd("JANUARY 7 2013"));
    }

    public static boolean isDateOdd(String date) {

        SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd yyyy", Locale.ENGLISH);
        //System.out.println(formatter);

        try {
            Date date2 = formatter.parse(date);
            int year = date2.getYear() + 1900;
            System.out.print(formatter.format(date2)             /*formatter.format(date2)*/);
//            System.out.println(date2.getYear() + 1900);
            Date date4 = formatter.parse("JANUARY 1 " + year);
//            date3.setYear(year);
//            date3.setMonth(0);
//            date3.setDate(1);
//            date3.setHours(0);
//            date3.setMinutes(0);
//            date3.setSeconds(0);

//            System.out.println(formatter.format(date3));
            long diff = date2.getTime() - date4.getTime();
            long time = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS) + 1;
//            int day = (int) (time / (24 * 60 * 60 * 1000));
//            System.out.println(day);
            // day == 0 for JANUARY 1
            return time % 2 != 0;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return true;
    }
}

package com.javarush.task.task40.task4009;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* 
Buon Compleanno!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getWeekdayOfBirthday("30.05.1984", "2015"));
    }

    public static String getWeekdayOfBirthday(String birthday, String year) {
        //напишите тут ваш код
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.y");
        LocalDate date = LocalDate.parse(birthday, formatter);

        DateTimeFormatter formatYear = DateTimeFormatter.ofPattern("y");
        Year year1 = Year.parse(year, formatYear);

        return date.withYear(year1.getValue()).format(DateTimeFormatter.ofPattern("EEEE").withLocale(Locale.ITALIAN));

    }
}

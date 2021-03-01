package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        DateTimeFormatter time = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(time.format(now));
    }
}

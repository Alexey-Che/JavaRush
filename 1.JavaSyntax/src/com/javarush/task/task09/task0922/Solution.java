package com.javarush.task.task09.task0922;

/* 
Какое сегодня число?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String dateInputStr = bufferedReader.readLine();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date date1 = format.parse(dateInputStr);
        SimpleDateFormat formatOut = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        String result = formatOut.format(date1);
        System.out.println(result.toUpperCase());
    }
}

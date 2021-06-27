package com.javarush.task.task37.task3714;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/* 
Древний Рим
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a roman number to be converted to decimal: ");
        String romanString = bufferedReader.readLine();
        System.out.println("Conversion result equals " + romanToInteger(romanString));
    }

    public static int romanToInteger(String s) {
        Map<Character, Integer> numbersMap = new HashMap<>();
        numbersMap.put('I', 1);
        numbersMap.put('V', 5);
        numbersMap.put('X', 10);
        numbersMap.put('L', 50);
        numbersMap.put('C', 100);
        numbersMap.put('D', 500);
        numbersMap.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);      // Current Roman Character

            //Case 1
            if (i > 0 && numbersMap.get(ch) > numbersMap.get(s.charAt(i - 1))) {
                result += numbersMap.get(ch) - 2 * numbersMap.get(s.charAt(i - 1));
            }

            // Case 2: just add the corresponding number to result.
            else
                result += numbersMap.get(ch);
        }

        return result;
    }
}

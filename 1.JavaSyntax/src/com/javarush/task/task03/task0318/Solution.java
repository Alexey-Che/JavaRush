package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] name = new String[2];
        for(int i=0; i <2;i++)  {
            name[i] = bufferedReader.readLine();
        }
        System.out.println(name[1] + " захватит мир через "+ name[0] +" лет. Му-ха-ха!");



    }
}

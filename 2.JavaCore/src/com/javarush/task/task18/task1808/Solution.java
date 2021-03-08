package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileOutPutName2 = bufferedReader.readLine();
        String fileOutPutName3 = bufferedReader.readLine();

        try {
            FileInputStream fileInputStream = new FileInputStream(fileName1);
            FileOutputStream fileOutputStream = new FileOutputStream(fileOutPutName2);
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileOutPutName3);

            int HalfOfFile = (fileInputStream.available() + 1 )/ 2;
            int countBytes = 0;
            while (fileInputStream.available() > 0) {

                if (countBytes < HalfOfFile) {
                    fileOutputStream.write(fileInputStream.read());
                    countBytes++;
                } else {
                    fileOutputStream2.write(fileInputStream.read());
                }
            }
            fileInputStream.close();
            fileOutputStream.close();
            fileOutputStream2.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}

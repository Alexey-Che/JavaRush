package com.javarush.task.task33.task3310;

import com.javarush.task.task33.task3310.strategy.*;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        testStrategy(new HashMapStorageStrategy(), 10000L);
        testStrategy(new OurHashMapStorageStrategy(), 10000L);
        testStrategy(new OurHashBiMapStorageStrategy(), 10000L);
        testStrategy(new HashBiMapStorageStrategy(), 10000L);
        testStrategy(new DualHashBidiMapStorageStrategy(), 10000L);
    }

    public static Set<Long> getIds(Shortener shortener, Set<String> strings) {
        Set<Long> result = new HashSet<>();
        for (String str : strings) {
            result.add(shortener.getId(str));
        }
        return result;
    }

    public static Set<String> getStrings(Shortener shortener, Set<Long> keys) {
        Set<String> result = new HashSet<>();
        for (Long key : keys) {
            result.add(shortener.getString(key));
        }
        return result;
    }

    public static void testStrategy(StorageStrategy strategy, long elementsNumber) {
        Helper.printMessage(strategy.getClass().getSimpleName());
        Set<String> testOrigin = new HashSet<>();
        for (int i = 0; i < elementsNumber; i++) {
            testOrigin.add(Helper.generateRandomString());
        }
        Shortener shortener = new Shortener(strategy);
        Date timeStamp = new Date();
        Set<Long> test = getIds(shortener, testOrigin);
        Date timeStampEnd = new Date();
        Long time = timeStampEnd.getTime() - timeStamp.getTime();
        Helper.printMessage("Время получения идентификаторов для " + elementsNumber + " строк: " + time);

        timeStamp = new Date();
        Set<String> strings = getStrings(shortener, test);
        timeStampEnd = new Date();
        time = timeStampEnd.getTime() - timeStamp.getTime();
        Helper.printMessage("Время получения строк для " + elementsNumber + " идентификаторов: " + time);

        if (testOrigin.equals(strings)) {
            Helper.printMessage("Тест пройден.");
        } else {
            Helper.printMessage("Тест не пройден.");
        }
    }
}

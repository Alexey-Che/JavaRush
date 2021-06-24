package com.javarush.task.task33.task3310.tests;

import com.javarush.task.task33.task3310.Shortener;
import com.javarush.task.task33.task3310.strategy.*;
import org.junit.Assert;
import org.junit.Test;

public class FunctionalTest {

    @Test
    public void testHashMapStorageStrategy() {
        Shortener shortener = new Shortener(new HashMapStorageStrategy());
        testStorage(shortener);
    }

    @Test
    public void testOurHashMapStorageStrategy() {
        Shortener shortener = new Shortener(new OurHashMapStorageStrategy());
        testStorage(shortener);
    }

    @Test
    public void testFileStorageStrategy() {
        Shortener shortener = new Shortener(new FileStorageStrategy());
        testStorage(shortener);
    }

    @Test
    public void testHashBiMapStorageStrategy() {
        Shortener shortener = new Shortener(new HashBiMapStorageStrategy());
        testStorage(shortener);
    }

    @Test
    public void testDualHashBidiMapStorageStrategy() {
        Shortener shortener = new Shortener(new DualHashBidiMapStorageStrategy());
        testStorage(shortener);
    }

    @Test
    public void testOurHashBiMapStorageStrategy() {
        Shortener shortener = new Shortener(new OurHashBiMapStorageStrategy());
        testStorage(shortener);
    }

    public void testStorage(Shortener shortener) {
        String testString1 = "test String 1";
        String testString2 = "test String 2";
        String testString3 = "test String 1";

        Long test1 = shortener.getId(testString1);
        Long test2 = shortener.getId(testString2);
        Long test3 = shortener.getId(testString3);

        Assert.assertNotEquals(test2, test1);
        Assert.assertNotEquals(test2, test3);
        Assert.assertEquals(test1, test3);

        Assert.assertEquals(testString1, shortener.getString(test1));
        Assert.assertEquals(testString2, shortener.getString(test2));
        Assert.assertEquals(testString3, shortener.getString(test3));
    }
}

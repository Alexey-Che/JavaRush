package com.javarush.task.task25.task2502;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* 
Машину на СТО не повезем!
*/

public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() throws IllegalAccessException {
            //init wheels here
            Set<Wheel> wheelSet = new HashSet<>(4);
            String[] loadWheelNamesFromDB = loadWheelNamesFromDB();
            if (loadWheelNamesFromDB.length != 4) throw new IllegalAccessException();
            for (String wheel : loadWheelNamesFromDB) {
                wheelSet.add(Wheel.valueOf(wheel));
            }
            wheels = new ArrayList<Wheel>(wheelSet);
        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
    }
}

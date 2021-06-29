package com.javarush.task.task37.task3702;

import com.javarush.task.task37.task3702.female.FemaleFactory;
import com.javarush.task.task37.task3702.male.MaleFactory;

public class FactoryProducer {

    public static enum HumanFactoryType {
        MALE,
        FEMALE;
    }

    public static AbstractFactory getFactory(HumanFactoryType type) {
        AbstractFactory factory;
        if (type == HumanFactoryType.MALE) {
            factory = new MaleFactory();
        } else factory = new FemaleFactory();
        return factory;
    }
}

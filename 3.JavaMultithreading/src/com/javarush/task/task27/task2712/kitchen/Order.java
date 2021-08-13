package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Tablet;

import java.io.IOException;
import java.util.List;

public class Order {
    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        initDishes();
        ConsoleHelper.writeMessage(toString());
    }

    protected void initDishes() throws IOException {
        this.dishes = ConsoleHelper.getAllDishesForOrder();
    }

    public int getTotalCookingTime() {
        return dishes.stream().mapToInt(Dish::getDuration).sum();
    }

    public boolean isEmpty() {
        return dishes.isEmpty();
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    @Override
    public String toString() {
        String result = "";
        if (dishes.size() == 0) return result;
        result += "Your order: [" + dishes.get(0);
        for (int i = 1; i < dishes.size(); i++) {
            result += ", " + dishes.get(i);
        }
        result += "] of " + tablet + ", cooking time " + getTotalCookingTime() + "min";
        return result;
    }

    public Object getTablet() {
        return tablet;
    }
}

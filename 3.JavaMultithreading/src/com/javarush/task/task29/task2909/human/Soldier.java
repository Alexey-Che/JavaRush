package com.javarush.task.task29.task2909.human;

public class Soldier extends Human{

    public Soldier(String name, int age) {
        super(name, age);
    }

    @Override
    public void setBloodGroup(BloodGroup code) {
        super.setBloodGroup(code);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void live() {
        super.live();
        fight();
    }

    public void fight() {
    }
}

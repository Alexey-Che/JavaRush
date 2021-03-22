package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    private List<Horse> horses;

    static Hippodrome game;


    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move() {
        for (Horse horse: horses) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse: horses) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        double maxDistance = Double.MIN_VALUE;
        Horse winner = null;
        for (Horse horse: horses) {
            if (horse.distance > maxDistance) {
                maxDistance = horse.distance;
                winner = horse;
            }
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner() + "!");
    }

    
    public static void main(String[] args) throws InterruptedException {

        ArrayList<Horse> horses = new ArrayList<>();

        Horse horse1 = new Horse("\uD83D\uDC0E", 3, 0);
        Horse horse2 = new Horse("2", 3, 0);
        Horse horse3 = new Horse("3", 3, 0);
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);

        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }
}

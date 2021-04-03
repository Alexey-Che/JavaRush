package com.javarush.task.task25.task2504;

/* 
Switch для нитей
*/

public class Solution {
    public static void processThreads(Thread... threads) {
        //implement this method - реализуйте этот метод
        for (Thread thread: threads) {
            Thread.State state = thread.getState();
            switch (state) {
                case NEW:
                    thread.start();
                    break;
                case TIMED_WAITING:
                case BLOCKED:
                case WAITING:
                    thread.interrupt();
                    break;
                case RUNNABLE:
                    if (thread.isInterrupted()) {
                        throw new RuntimeException();
                    }
                    break;
                case TERMINATED:
                    System.out.println(thread.getPriority());
            }
        }
    }

    public static void main(String[] args) {
    }
}

package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread{
    private Thread thread;

    public LoggingStateThread(Thread thread) {
        this.thread = thread;
    }

    State state, lastState = null;

    @Override
    public void run() {
        do{
            state = thread.getState();
            if (state != lastState) {
                System.out.println(state);
                lastState = state;
            }


        } while (state != State.TERMINATED);
    }
}

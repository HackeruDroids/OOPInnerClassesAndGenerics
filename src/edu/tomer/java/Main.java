package edu.tomer.java;

import java.util.Timer;

public class Main {

    public static void main(String[] args) {
        Timer t = new Timer();

        DriveTask task = new DriveTask();

        // t.schedule(task, 5 * 1000);

        t.scheduleAtFixedRate(task, 0, 1000);

    }
}

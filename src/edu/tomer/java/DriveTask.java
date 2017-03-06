package edu.tomer.java;

import java.util.TimerTask;

/**
 * Created by hackeru on 06/03/2017.
 */
public class DriveTask extends TimerTask {

    String[] printMe = {"5", "4", "3", "2", "1", "Boom"};
    Car c = new Car();
    int counter = 0;

    @Override
    public void run() {
        counter++;
        if (counter == printMe.length)
            counter = 0;
        System.out.println(printMe[counter]);
        c.drive();
        c.turn(20);
    }
}

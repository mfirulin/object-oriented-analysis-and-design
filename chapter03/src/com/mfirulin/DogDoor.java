package com.mfirulin;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    private boolean open = false;
    private final Timer timer;

    {
        timer = new Timer();
    }

    public void open() {
        System.out.println("The dog door opens");
        open = true;

        timer.schedule(new TimerTask() {
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close() {
        System.out.println("The dog door closes");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }
}

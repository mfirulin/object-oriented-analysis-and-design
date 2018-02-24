package com.mfirulin;

import com.mfirulin.BarkRecognizer;

public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);

        System.out.println("TC 1. Without delay");
        System.out.println("Fido starts barking");
        recognizer.recognize("Woof 1");
        System.out.println("Fido has gone outside...");
        System.out.println("Fido has all done...");
//        System.out.println("Fido's back inside...");
//        System.out.println();
        try {
            Thread.currentThread().sleep(10000);
        }
        catch (InterruptedException e) {
        }

        System.out.println("... but he's stuck outside");
        System.out.println("Fido starts barking");
        recognizer.recognize("Woof 2");
        System.out.println("Fido's back inside...");
    }
}

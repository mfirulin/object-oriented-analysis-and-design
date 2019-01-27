package com.mfirulin;

public class DogDoorSimulator {
    public static void main(String[] args) {
        var door = new DogDoor();
        var remote = new Remote(door);

        System.out.println("TC 1. Without delay");
        System.out.println("Fido barks to go outside...");
        remote.pressButton();
        System.out.println("Fido has gone outside...");
        System.out.println("Fido has all done...");
        System.out.println("Fido's back inside...");
        System.out.println();

        try {
            Thread.currentThread().sleep(10000);
        }
        catch (InterruptedException e) {
        }

        System.out.println("TC 2. With delay");
        System.out.println("Fido barks to go outside...");
        remote.pressButton();
        System.out.println("Fido has gone outside...");
        System.out.println("Fido has all done...");

        try {
            Thread.currentThread().sleep(10000);
        }
        catch (InterruptedException e) {
        }

        System.out.println("... but he's stuck outside");
        System.out.println("Fido starts barking...");
        System.out.println("... so Gina grabs the remote control");
        remote.pressButton();
        System.out.println("Fido's back inside...");
    }
}

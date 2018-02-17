package com.mfirulin;

public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);
        System.out.println("Fido barks to go outsie...");
        remote.pressButton();
        System.out.println("Fido has gone outsie...");
        System.out.println("Fido has all done...");
        System.out.println("Fido is back insie...");
    }
}

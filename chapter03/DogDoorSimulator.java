public class DogDoorSimulator {
    public static void main(String[] args) {
        var door = new DogDoor();
        var recognizer = new BarkRecognizer(door);

        System.out.println("TC 1. Without delay");
        System.out.println("Fido starts barking");
        recognizer.recognize("Woof 1");
        System.out.println("Fido has gone outside...");
        System.out.println("Fido has all done...");

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

public class DogDoorSimulator {
    public static void main(String[] args) {
        var door = new DogDoor();
        var recognizer = new BarkRecognizer(door);
        recognizer.addAllowedBark(new Bark("rowlf"));
        recognizer.addAllowedBark(new Bark("rooowlf"));
        recognizer.addAllowedBark(new Bark("rawlf"));
        recognizer.addAllowedBark(new Bark("woof"));

        System.out.println("TC 1. Correct bark");
        System.out.println("Fido starts barking");
        recognizer.recognize(new Bark("rowlf"));
        System.out.println("Fido has gone outside...");

        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {
        }

        System.out.println("Fido has all done...");
        System.out.println("... but he's stuck outside");

        System.out.println("TC 2. Incorrect bark");

        System.out.println("A small dog starts barking");
        recognizer.recognize(new Bark("yip"));

        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
        }

        System.out.println("TC 2. Correct bark 2");
        System.out.println("Fido starts barking");
        recognizer.recognize(new Bark("rooowlf"));
        System.out.println("Fido's back inside...");
    }
}

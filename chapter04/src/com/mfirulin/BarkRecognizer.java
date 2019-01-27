package com.mfirulin;

import java.util.ArrayList;
import java.util.List;

public class BarkRecognizer {
    private List<Bark> allowedBarks = new ArrayList<>();
    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void addAllowedBark(Bark bark) {
        allowedBarks.add(bark);
    }

    public void recognize(Bark bark) {

        for (Bark item: allowedBarks)
            if (item.equals(bark)) {
                System.out.println("BarkRecognizer: correct bark");
                if (!door.isOpen())
                    door.open();
                return;
            }

        System.out.println("BarkRecognizer: incorrect bark");
    }
}

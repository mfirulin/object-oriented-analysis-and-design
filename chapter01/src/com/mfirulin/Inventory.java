package com.mfirulin;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventory {
    private ArrayList<Guitar> guitars;

    {
        guitars = new ArrayList<>();
    }

    public void addGuitar(String serialNumber, double price, String model, int numStrings,
                          Builder builder, Type type, Wood backWood, Wood topWood) {

        guitars.add(new Guitar(serialNumber, price, model, numStrings, builder, type, backWood, topWood));
    }

    public ArrayList<Guitar> search(GuitarSpec spec) {
        ArrayList<Guitar> matchingGuitars = new ArrayList<>();

        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = i.next();
            if (spec.equals(guitar.getSpec()))
                matchingGuitars.add(guitar);
        }

        return matchingGuitars;
    }
}

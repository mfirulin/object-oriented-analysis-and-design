package com.mfirulin;

public class Guitar {
    private String serialNumber;
    double price;
    GuitarSpec spec;

    Guitar(String serialNumber, double price, String model, int numStrings, Builder builder, Type type, Wood backWood,
           Wood topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = new GuitarSpec(model, numStrings, builder, type, backWood, topWood);
    }

    public String toString() {
        return getClass().getName() + "[seriaNumber=" + serialNumber + " price=" + price + " spec=" + spec + "]";
    }

    String getSerialNumber() {
        return serialNumber;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    GuitarSpec getSpec() {
        return spec;
    }
}

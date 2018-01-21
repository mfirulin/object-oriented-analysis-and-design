package com.mfirulin;

import java.util.Objects;

public class GuitarSpec {
    private String model;
    private int numStrings;
    private Builder builder;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    
    public GuitarSpec(String model, int numStrings, Builder builder, Type type, Wood backWood, Wood topWood) {
        this.model = model;
        this.numStrings = numStrings;
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public boolean equals(GuitarSpec other) {
        if (other == null) return false;
        if (other == this) return true;
        if (getClass() != other.getClass()) return false;
        
        return Objects.equals(model, other.model);
    }

    public int hashCode() {
        return Objects.hash(model, numStrings, builder, type, backWood, topWood);
    }

    public String toString() {
        return getClass().getName() + "[model=" + model + " builder=" + builder + " type=" + type +
                " backWood=" + backWood + " topWood=" + topWood + "]";
    }

    public String getModel() {
        return model;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }
}

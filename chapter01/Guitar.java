public class Guitar {
    private String serialNumber;
    private double price;
    private GuitarSpec spec;

    Guitar(String serialNumber, double price, String model, int numStrings, Builder builder, Type type, Wood backWood,
           Wood topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = new GuitarSpec(model, numStrings, builder, type, backWood, topWood);
    }

    public String toString() {
        return getClass().getName() + "[seriaNumber=" + serialNumber + " price=" + price + " spec=" + spec + "]";
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public GuitarSpec getSpec() {
        return spec;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars = new ArrayList<>();

    public void addGuitar(String serialNumber, double price, String model, int numStrings,
                          Builder builder, Type type, Wood backWood, Wood topWood) {
        guitars.add(new Guitar(serialNumber, price, model, numStrings, builder, type, backWood, topWood));
    }

    public List<Guitar> search(GuitarSpec spec) {
        final var matchingGuitars = new ArrayList<Guitar>();

        for (Guitar guitar: guitars) {
            if (spec.equals(guitar.getSpec()))
                matchingGuitars.add(guitar);
        }

        return matchingGuitars;
    }
}

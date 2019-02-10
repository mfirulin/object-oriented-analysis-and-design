import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    private ArrayList<Guitar> guitars = new ArrayList<>();

    public void addGuitar(String serialNumber, double price, String model, int numStrings,
                          Builder builder, Type type, Wood backWood, Wood topWood) {
        guitars.add(new Guitar(serialNumber, price, model, numStrings, builder, type, backWood, topWood));
    }

    public List<Guitar> search(GuitarSpec spec) {
        final var matchingGuitars = new ArrayList<Guitar>();

        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = i.next();
            if (spec.equals(guitar.getSpec()))
                matchingGuitars.add(guitar);
        }

        return matchingGuitars;
    }
}

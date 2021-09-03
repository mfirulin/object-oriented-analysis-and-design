import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Instrument> instruments = new ArrayList<>();

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        instruments.add(new Instrument(serialNumber, price, spec));
    }

    public List<Instrument> search(InstrumentSpec spec) {
        List<Instrument> matchingInstruments = new ArrayList<>();

        for (var entry: instruments) {
            if (entry.getSpec().equals(spec)) {
                matchingInstruments.add(entry);
            }
        }
        return matchingInstruments;
    }
}

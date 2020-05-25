
public class Main {

    public static void main(String[] args) {
	Inventory inventory = new Inventory();

	inventory.addGuitar("1", 1500.0, "Stratocaster", 6, Builder.FENDER,
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("2", 1600.0, "Stratocaster", 6, Builder.FENDER,
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("3", 2000.0, "Les Paul", 6, Builder.GIBSON,
                Type.ELECTRIC, Wood.MAHOGANY, Wood.MAHOGANY);
        inventory.addGuitar("4", 1000.0, "", 6, Builder.MARTIN,
                Type.ACOUSTIC, Wood.MAHOGANY, Wood.SPRUCE);

        GuitarSpec spec = new GuitarSpec("Stratocaster", 6, Builder.FENDER, Type.ELECTRIC, Wood.ALDER,
                Wood.ALDER);

        var guitars = inventory.search(spec);
        System.out.println(guitars);
    }
}

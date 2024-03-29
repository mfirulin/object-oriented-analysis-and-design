package board;

import java.util.LinkedList;
import java.util.List;
import unit.Unit;

public class Tile {
    private List<Unit> units = new LinkedList<>();

    protected void addUnit(Unit unit) {
        units.add(unit);
    }

    protected void removeUnit(Unit unit) {
        units.remove(unit);
    }

    protected void removeUnits() {
        units.clear();
    }

    protected List<Unit> getUnits() {
        return units;
    }
}

package gsf.board;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import gsf.unit.Unit;

public class Board {
    private int width, height;
    private List<List<Tile>> tiles;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        init();
    }

    private void init() {
        tiles = new ArrayList<List<Tile>>(width);

        for (int i = 0; i < width; i++) {
            tiles.add(i, new ArrayList<Tile>(height));
            for (int j = 0; j < height;  j++) {
                tiles.get(i).add(j, new Tile());
            }
        }
    }

    public Tile getTile(int x, int y) {
        return tiles.get(x - 1).get(y - 1);
    }

    public void addUnit(Unit unit, int x, int y) {
        getTile(x, y).addUnit(unit);
    }

    public void removeUnit(Unit unit, int x, int y) {
        getTile(x, y).removeUnit(unit);
    }

    public void removeUnits(int x, int y) {
        getTile(x, y).removeUnits();
    }

    public List<Unit> getUnits(int x, int y) {
        return getTile(x, y).getUnits();
    }
}

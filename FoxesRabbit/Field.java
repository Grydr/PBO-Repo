import java.util.ArrayList;
import java.util.List;

public class Field {
    private Object[][] field;

    public Field(int depth, int width) {
        field = new Object[depth][width];
    }

    public void printField() {
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                Object obj = field[row][col];
                if (obj instanceof Animal animal) {
                    System.out.print(animal.getChar() + " ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void clear(Location location) {
        field[location.getRow()][location.getCol()] = null;
    }

    public void place(Object object, Location location) {
        field[location.getRow()][location.getCol()] = object;
    }

    public Object getObjectAt(Location location) {
        return field[location.getRow()][location.getCol()];
    }

    public Location freeAdjacentLocation(Location location) {
        List<Location> free = new ArrayList<>();
        List<Location> adjacent = adjacentLocations(location);

        for (Location loc : adjacent) {
            if (getObjectAt(loc) == null) {
                free.add(loc);
            }
        }

        return free.isEmpty() ? null : free.get(0);
    }

    public List<Location> adjacentLocations(Location location) {
        List<Location> locations = new ArrayList<>();

        int row = location.getRow();
        int col = location.getCol();

        int maxRow = field.length;
        int maxCol = field[0].length;

        for (int r = row - 1; r < row + 1; r++) {
            for (int c = col - 1; c < col + 1; c++) {
                if (r == row && c == col) {
                    continue;
                }

                if (r >= 0 && r < maxRow && c >= 0 && c < maxCol) {
                    locations.add(new Location(r, c));
                }
            }
        }

        return locations;
    }

    public int getDepth() {
        return field.length;
    }

    public int getWidth() {
        return field[0].length;
    }
}

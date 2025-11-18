import java.util.ArrayList;
import java.util.List;

public class Simulator {
    private Field field;
    private List<Animal> animals;

    public Simulator(int depth, int width) {
        field = new Field(depth, width);
        animals = new ArrayList<>();
        populate();
    }

    public void simulate(int steps) {
        for (int step = 0; step < steps; step++) {
            List<Animal> newAnimals = new ArrayList<>();
            List<Animal> currentAnimals = new ArrayList<>(animals);

            for (Animal animal : currentAnimals) {
                animal.act(newAnimals);
            }

            animals.addAll(newAnimals);
            animals.removeIf(a -> !a.isAlive());

            field.printField();
        }
    }

    public void populate() {
        // add logic to populate field with foxes & rabbit
        for (int row = 0; row < field.getDepth(); row++) {
            for (int col = 0; col < field.getWidth(); col++) {
                double rand = Math.random();
                Location location = new Location(row, col);

                if (rand <= 0.08) {
                    animals.add(new Rabbit(field, location));
                } else if (rand <= 0.10) {
                    animals.add(new Fox(field, location));
                } else {
                    field.clear(location);
                }
            }
        }
    }
}

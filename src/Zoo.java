import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();
    public List<Animal> getAnimals() {
        return animals;
    }
    public Zoo addAnimal(Animal animal) {
        animals.add(animal);
        return this;
    }

    @Override
    public String toString() {
        return "" +
                "" + animals +
                "";
    }
    public List<SwimmingSpeed> getswimmingSpeed(){
        List<SwimmingSpeed> result = new ArrayList<>();
        for (Animal item: animals) {
            if (item instanceof SwimmingSpeed) {
                result.add((SwimmingSpeed) item);

            }
        }
        return result;
    }
    public int getChempionSpeed() {
        int max = 0;
        for (SwimmingSpeed item : getswimmingSpeed()) {
            if (item.swimmingSpeed() > max) {
                max = item.swimmingSpeed();
            }
        }
        return max;
    }
}

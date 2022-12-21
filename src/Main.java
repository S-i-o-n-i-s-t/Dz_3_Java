import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Dolphin("Dolphin", "Mammals", 40))
                .addAnimal(new Penguin("Pengoin", "Birds", 10))
                .addAnimal(new Seal("Seal", "Mammals", 24))
                .addAnimal(new Tuna("Tuna", "Fich", 75));
        System.out.println(zoo);
        for (SwimmingSpeed item: zoo.getswimmingSpeed()) {
            System.out.println(item.swimmingSpeed());
        }
        System.out.println(zoo.getChempionSpeed());

    }
}


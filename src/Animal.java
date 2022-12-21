
public class Animal {
    private String nameAnimal;
    private String classAnimal;
    private int swimmingSpeed;

    public Animal(String nameAnimal, String classAnimal, int swimmingSpeed) {
        this.nameAnimal = nameAnimal;
        this.classAnimal = classAnimal;
        this.swimmingSpeed = swimmingSpeed;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public String getClassAnimal() {
        return classAnimal;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    @Override
    public String toString() {
        return "Animal " +
                "nameAnimal = '" + nameAnimal + '\'' +
                ", classAnimal = '" + classAnimal + '\'' +
                ", swimmingSpeed = " + swimmingSpeed +
                "";
    }
}

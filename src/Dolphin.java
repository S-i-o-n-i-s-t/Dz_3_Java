public class Dolphin extends Animal implements SwimmingSpeed{
    public Dolphin(String nameAnimal, String classAnimal, int swimmingSpeed) {
        super(nameAnimal, classAnimal, swimmingSpeed);
    }

    @Override
    public String toString() {
        return "Dolphin{}";
    }
    public int swimmingSpeed(){
        return 40;
    };

}

public class Seal extends Animal implements  SwimmingSpeed{
    public Seal(String nameAnimal, String classAnimal, int swimmingSpeed) {
        super(nameAnimal, classAnimal, swimmingSpeed);
    }
    public int swimmingSpeed(){
        return 24;
    };

}

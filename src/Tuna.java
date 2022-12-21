public class Tuna extends Animal implements SwimmingSpeed{
    public Tuna(String nameAnimal, String classAnimal, int swimmingSpeed) {
        super(nameAnimal, classAnimal, swimmingSpeed);
    }
    public int swimmingSpeed(){
        return 75;
    };

}

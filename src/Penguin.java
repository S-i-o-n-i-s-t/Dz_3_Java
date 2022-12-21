public class Penguin extends Animal implements SwimmingSpeed{
    public Penguin(String nameAnimal, String classAnimal, int swimmingSpeed) {
        super(nameAnimal, classAnimal, swimmingSpeed);
    }
    public int swimmingSpeed(){
        return 10;
    };

}

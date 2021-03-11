package animaloop;

public class Horse extends Animal {

    boolean canSleepStandingUp = true;

    public Horse(String food, String location) {
        super(food, location);
    }

    public void makeNoise() {
        System.out.println("Игого");
    }

    public void eat() {
        System.out.println("*кушает овёс*");
    }
}
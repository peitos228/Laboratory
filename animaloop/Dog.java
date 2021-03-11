package animaloop;

public class Dog extends Animal {

    String breed = "Labrador";

    public Dog(String food, String location) {
        super(food, location);
    }

    public void makeNoise() {
        System.out.println("Гав");
    }

    public void eat() {
        System.out.println("*грызёт косточку*");
    }
}
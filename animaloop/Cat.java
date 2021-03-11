package animaloop;

public class Cat extends Animal {

    String whisker = "long";

    public Cat(String food, String location) {
        super(food, location);
    }

    public void makeNoise() {
        System.out.println("Мяу");
    }

    public void eat() {
        System.out.println("*ест кошачий корм*");
    }
}
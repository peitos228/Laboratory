package OOP;

public class Feeder {
    public void feed(Cow cow){
        System.out.println("The cow is feed!");
    }

    public void feed(Animal animal){
        System.out.println("The " + animal.getName() + " is feed!");
    }
}

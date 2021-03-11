package animaloop;

public class Main {
    public static void main(String[] args){
        final int NUMBER_OF_ANIMALS = 3;
        Animal[] animals = new Animal[NUMBER_OF_ANIMALS];
        animals[0] = new Cat("сытый", "дома");
        animals[1] = new Dog("хочет кушац","гуляет");
        animals[2] = new Horse("не голодна", "в хлеву");
        Veterinar vet = new Veterinar();
        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
        animals[0].makeNoise();
        animals[1].eat();
        animals[2].sleep();
    }
}
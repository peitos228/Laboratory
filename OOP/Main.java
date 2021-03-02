package OOP;

public class Main {
    
    public static void main(String[] args) {
        /*Box emptyBox = new Box();
        
        System.out.println("Empty box has value = " + emptyBox.getWidth());
        System.out.println("Empty box = " + emptyBox);
        System.out.println("Empty box = " + emptyBox.toString());

        Box box = new Box(1,2,3);

        Container container = new Container(1,3,3,7);
        Container defaultContainer = new Container();

        // container.printAll();
        // defaultContainer.printAll();
        
        Box castBox = new Container();
        System.out.println(((Container) castBox).getWeight());
        
        box.printAll();
        System.out.println("\n\n\n\n\n");
        container.printAll();*/

        /*Cat cat = new Cat();
        Dog dog = new Dog();

        Animal[] animals = new Animal[]{cat, dog}; 
        for (Animal animal : animals){
            animal.voice();
            animal.run();
            animal.walk();
        }

        Cow cow = new Cow();
        Sound[] sounds = new Sound[]{cat,dog,cow};
        for (Sound sound : sounds){
            sound.voice();
            if (sound instanceof Animal){
                ((Animal)sound).run();
            }else if (sound instanceof Cow){
                ((Cow)sound).run();
            }
        }*/
        Cat cat = new Cat("Misha");
        Dog dogMuh = new Dog("Muhtar");
        Dog dogShar = new Dog("Sharik");
        Cow cow = new Cow();
        Feeder feeder = new Feeder();
        feeder.feed(cat);
        feeder.feed(dogMuh);
        feeder.feed(dogShar);
        feeder.feed(cow);
        
    }
}

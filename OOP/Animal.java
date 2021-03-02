package OOP;

public abstract class Animal implements Sound, MeanOfTransport {
    
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public void voice(){

    }

    public void run(){
        System.out.println("I am running");
    }

    public void walk(){
        System.out.println("I am walking");
    }


    public String getName(){
        return name;
    }
}

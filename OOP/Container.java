package OOP;

public class Container extends Box {
    double weight;

    public Container(){
        super(1,2,3);
        this.weight = 4;
    }
    
    public Container(double width, double height, double depth, double weight){
        super(width, height, depth);
        this.weight = weight;
    }
    
    public double getWeight(){
        return weight;
    }

    @Override
    public void printAll(){
        super.printAll();
        System.out.println("Weight is " + weight);
    }
}

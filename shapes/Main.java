package shapes;

public class Main {
    public static void main(String[] args){
        final int NUM_OF_SHAPES = 2;
        Shape[] shapes = new Shape[NUM_OF_SHAPES];
        shapes[0] = new Circle("1,2,3,4");
        shapes[1] = new Rectangle("2,3,4,5,9,8,7,6");
        for(Shape shape : shapes){
            shape.draw();
        }
    }
}

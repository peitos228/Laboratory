package shapes;

public class Main {
    public static void main(String[] args){
        final int NUM_OF_SHAPES = 2;
        Shape[] shapes = new Shape[NUM_OF_SHAPES];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        for(Shape shape : shapes){
            shape.draw();
        }
    }
}

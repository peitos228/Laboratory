package shapes;

public class Main {
    public static void main(String[] args) {
        final int NUM_OF_SHAPES = 2;
        Shape[] shapes = new Shape[NUM_OF_SHAPES];
        shapes[0] = new Circle("Blue", 1, 2, 3, 4);
        shapes[1] = new Rectangle("Red", 4, 3, 2, 1);
        for (Shape shape: shapes) {
            shape.draw();
        }
        System.out.println(shapes[0].equals(shapes[1]));
        System.out.println(shapes[1].equals(shapes[1]));
    }
}
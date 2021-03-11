package shapes;

public abstract class Shape {

    String color;

    public abstract void draw();

    public boolean equals(Shape shape1, Shape shape2) {
        if (shape1.color == shape2.color) {
            return true;
        } else {
            return false;
        }
    }
}
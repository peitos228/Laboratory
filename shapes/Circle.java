package shapes;

public class Circle extends Shape {
    int x1;
    int y1;
    int x2;
    int y2;
    String name = "Круг";
    String color;

    public Circle(String color, int x1, int y1, int x2, int y2) {
        this.color = color;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public boolean equals(Circle circ1, Circle circ2) {
        if (circ1.color == circ2.color && circ1.x1 == circ2.x1 && circ1.x2 == circ2.x2 && circ1.y1 == circ2.y1 && circ1.y2 == circ2.y2) {
            return true;
        } else {
            return false;
        }
    }

    public void draw() {
        System.out.println("Нарисовал " + name);
    }

}
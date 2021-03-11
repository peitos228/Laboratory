package shapes;

public class Rectangle extends Shape {

    int x1;
    int y1;
    int x2;
    int y2;
    String name = "Прямоугольник";
    String color;

    public Rectangle(String color, int x1, int y1, int x2, int y2) {
        this.color = color;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void draw() {
        System.out.println("Нарисовал " + name);
    }

    public boolean equals(Rectangle rect1, Rectangle rect2) {
        if (rect1.color == rect2.color && rect1.x1 == rect2.x1 && rect1.x2 == rect2.x2 && rect1.y1 == rect2.y1 && rect1.y2 == rect2.y2) {
            return true;
        } else {
            return false;
        }
    }

}
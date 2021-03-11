package shapes;

public class Circle extends Shape {
    int x1, y1, x2, y2;
    String name = "Круг";

    public void draw(){
        System.out.println("Нарисовал " + name);
    }
}

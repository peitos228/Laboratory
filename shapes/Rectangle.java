package shapes;

public class Rectangle extends Shape{
    int x1, y1, x2, y2, x3, y3, x4, y4;
    String name = "Прямоугольник";

    public void draw(){
        System.out.println("Нарисовал " + name);
    }
}

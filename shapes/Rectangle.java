package shapes;

public class Rectangle extends Shape{
    String coordinates;
    String name = "Прямоугольник";

    public Rectangle(String coordinates){
        this.coordinates = coordinates;
    }

    public void draw(){
        System.out.println("Нарисовал " + name);
    }
}

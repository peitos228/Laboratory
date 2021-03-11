package shapes;

public class Circle extends Shape {
    int x1, y1, x2, y2;
    String name = "Круг";
    String coordinates;

    public Circle(String coordinates){
        this.coordinates = coordinates;
    }

    public void draw(){
        System.out.println("Нарисовал " + name);
    }
}

package shapes;

public abstract class Shape implements Circle, Rectangle {
    
    String color;

    public void draw(){
        System.out.println("Нарисовал.");
    }
}
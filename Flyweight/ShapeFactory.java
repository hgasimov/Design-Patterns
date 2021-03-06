package Flyweight;

import Shape.Shape;
import java.util.HashMap;


public class ShapeFactory {
    private static HashMap<String, Shape> shapes = new HashMap<String, Shape>();
    
    public static Shape getCircle(String color) {
        Circle circle = (Circle) shapes.get(color);
        
        if (circle == null) {
            circle = new Circle(color);
            shapes.put(color, circle);
            System.out.println("Creating a circle of color " + color);
        }
        
        return circle;
    }
}

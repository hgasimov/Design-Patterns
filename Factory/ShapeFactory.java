package Factory;

import Color.Color;
import Shape.Circle;
import Shape.Rectangle;
import Shape.Shape;
import Shape.Square;


public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shape) {
        if (shape == null) return null;

        switch(shape){
            case "rectangle": return new Rectangle();
            case "square": return new Square();
            case "circle": return new Circle();
            default: return null;
        }
    }

    @Override
    Color getColor(String color) {
        return null;
    }

    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        
        Shape shape1 = sf.getShape("rectangle");
        Shape shape2 = sf.getShape("square");
        Shape shape3 = sf.getShape("circle");        
        
        shape1.draw();
        shape2.draw();
        shape3.draw();
    }    
}

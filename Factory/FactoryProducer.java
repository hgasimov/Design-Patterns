package Factory;

import Color.Color;
import Shape.Shape;


public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryName) {
        if (factoryName == null) return null;
        
        switch (factoryName) {
            case "SHAPE": return new ShapeFactory();
            case "COLOR": return new ColorFactory();
            default: return null;
        }
    }
    
    
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("square");
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color color1 = colorFactory.getColor("red");
        color1.fill();

        Color color2 = colorFactory.getColor("green");
        color2.fill();

        Color color3 = colorFactory.getColor("blue");
        color3.fill();
    }    
}

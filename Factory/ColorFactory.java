package Factory;

import Color.Blue;
import Color.Color;
import Color.Green;
import Color.Red;
import Shape.Shape;


public class ColorFactory extends AbstractFactory{

    @Override
    Color getColor(String color) {
        if (color == null) return null;

        switch(color){
            case "red": return new Red();
            case "green": return new Green();
            case "blue": return new Blue();
            default: return null;
        }
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
    
}

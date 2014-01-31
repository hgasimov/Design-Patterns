package Factory;

import Color.Color;
import Shape.Shape;


public abstract class AbstractFactory {
    abstract Color  getColor(String color);
    abstract Shape getShape(String shape);
}

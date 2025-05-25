package factorydesignpattern.factory;

import factorydesignpattern.shapes.Circle;
import factorydesignpattern.shapes.Rectangle;
import factorydesignpattern.shapes.Shape;
import factorydesignpattern.shapes.Square;

public class ShapeFactory {
  public  Shape getShape(String input){
        switch (input){
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}

package com.ireshrajitha.factories;

import com.ireshrajitha.shapes.Rectangle;
import com.ireshrajitha.shapes.Shape;
import com.ireshrajitha.shapes.Square;

public class ShapeFactory extends AbstractFactory {
    public Shape getShape(shapeTypes shapeTypes) {
        switch (shapeTypes){
            case SQUARE:return new Square();
            case RECTANGLE:return new Rectangle();
            default:return null;
        }
    }
}

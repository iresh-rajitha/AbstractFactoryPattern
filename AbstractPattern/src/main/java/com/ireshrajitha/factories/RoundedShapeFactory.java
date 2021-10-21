package com.ireshrajitha.factories;

import com.ireshrajitha.shapes.RoundedRectangle;
import com.ireshrajitha.shapes.RoundedSquare;
import com.ireshrajitha.shapes.Shape;

public class RoundedShapeFactory extends AbstractFactory{
    public Shape getShape(shapeTypes shapeTypes) {
        switch (shapeTypes){
            case RECTANGLE: return new RoundedRectangle();
            case SQUARE: return new RoundedSquare();
            default:return null;
        }
    }
}

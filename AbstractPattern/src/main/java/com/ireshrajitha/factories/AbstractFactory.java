package com.ireshrajitha.factories;

import com.ireshrajitha.shapes.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(shapeTypes shapeTypes);
}

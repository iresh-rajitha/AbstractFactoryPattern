package com.ireshrajitha.factories;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean isRounded){
        return  isRounded ?  new RoundedShapeFactory() :  new ShapeFactory();
    }
}

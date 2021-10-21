package com.ireshrajitha;

import com.ireshrajitha.factories.AbstractFactory;
import com.ireshrajitha.factories.FactoryProducer;
import com.ireshrajitha.factories.shapeTypes;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        shapeFactory.getShape(shapeTypes.RECTANGLE).draw();
        shapeFactory.getShape(shapeTypes.SQUARE).draw();
        System.out.println("========================================");
        AbstractFactory roundShapeFactory = FactoryProducer.getFactory(true);
        roundShapeFactory.getShape(shapeTypes.RECTANGLE).draw();
        roundShapeFactory.getShape(shapeTypes.SQUARE).draw();
    }
}

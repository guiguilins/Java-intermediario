package Generics.ShapeInterfaceGeneric.application;

import java.util.ArrayList;
import java.util.List;

import Interface.ShapeInterface.entities.AbstractShape;
import Interface.ShapeInterface.entities.Circle;
import Interface.ShapeInterface.entities.Rectangle;

public class Program {
    public static void main(String[] args) {

        List<AbstractShape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(null, 3, 2));
        myShapes.add(new Circle(null, 2));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(null, 2));
        myCircles.add(new Circle(null, 3));

        System.out.println("Total area: " + totalArea(myShapes));
        System.out.println("Total area: " + totalArea(myCircles));

    }

    public static double totalArea(List<? extends AbstractShape> list) {
        double sum = 0;
        for (AbstractShape s : list) {
            sum += s.area();
        }
        return sum;
    }
}

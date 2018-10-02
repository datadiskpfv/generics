package uk.co.datadisk;

import java.util.ArrayList;
import java.util.Collection;

public class Main_Generics_5 {

    // unbound parameters using <?>

    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.draw();
        s2.draw();

        Collection<Shape> shapeCollection = new ArrayList<>();
        shapeCollection.add(s1);
        shapeCollection.add(s2);

        if (s1 instanceof Object) {
            System.out.println("Shape instance of Object");
        }

        // Even through Shape is an object you cannot add an object to a Shape collection because
        // A collection of shapes is not the same as a collection of objects
        // Collection<Shape> != Collection<Object>
        // but Shape is instanceOf Object

        Object o1 = new Object();
        //shapeCollection.add(o1);          // compile error, you cannot add an Object to a Collection of Shape's, it has to be a Shape object

    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}

interface Shape {
    void draw();
}

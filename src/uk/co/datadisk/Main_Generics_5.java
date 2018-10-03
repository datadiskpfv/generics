package uk.co.datadisk;

import java.util.ArrayList;
import java.util.List;

public class Main_Generics_5 {

    // upper and lower bound parameters using <? extends Shape> and <? super Shape>
    // upper = extends
    // lower = super

    public static void main(String[] args) {

        Shape c1 = new Circle();
        Shape r1 = new Rectangle();
        Square s1 = new Square();
        //c1.draw();
        //r1.draw();

        List<Shape> shapes = new ArrayList<>();
        shapes.add(c1);
        shapes.add(r1);

        if (c1 instanceof Object) {
            System.out.println("Shape instance of Object");
        }

        // Even through Shape is an object you cannot add an object to a Shape collection because
        // A collection of Shape's is not the same as a collection of Object's
        // Collection<Shape> != Collection<Object>
        // but Shape is instanceOf Object

        Object o1 = new Object();
        //shapeCollection.add(o1);          // compile error, you cannot add an Object to a Collection of Shape's, it has to be a Shape object

        producer(shapes);
        consumer(shapes);
    }

    // UPPER BOUND
    private static void producer(List<? extends Shape> shapes) {
        // Producer: uses the extends keyword and thus you can list but you cannot add to the list

        // Unable to add to the list
        //Shape c1 = new Circle();
        //shapes.add(c1);

        // You are free to use any of Shapes methods
        for (Shape shape : shapes){
            shape.draw();
        }
    }

    // LOWER BOUND
    private static void consumer(List<? super Shape> shapes){
        //Consumer: uses the super keyword and thus you can add but you cannot use any methods of the class (only Object methods)

        // You are free to add to the list
        Shape c1 = new Circle();
        shapes.add(c1);

        // Here i am cheating as i am using a Object method, but no Shape methods are available because
        // its of type Object
        for (Object shape : shapes){
            System.out.println(shape.toString());
        }
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }

    @Override
    public String toString() {
        return "I am a Circle";
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }

    @Override
    public String toString() {
        return "I am a Rectangle";
    }
}

class Square  {
    public void draw() {
        System.out.println("Draw Rectangle");
    }

    @Override
    public String toString() {
        return "I am a Square";
    }
}

interface Shape {
    void draw();
}

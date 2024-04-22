package oopConcepts.oopPrinciples.polimorphism.sample1;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.draw();

        Square square = new Square();
        square.draw();

        Shape circle1 = new Circle();
        circle1 = new Square();

        /*
            above object creation is possible because of the following concept
            "is A" concept
            Circle object is a Shape
            Square object is a Shape
         */

    }
}

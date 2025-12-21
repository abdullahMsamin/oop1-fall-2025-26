// -- SHAPE --
abstract class Shape {

    
    abstract double calculateArea();
     void displayShape() {
        System.out.println("This is a shape.");
    }
}

// -- RECTANGLE --
class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    double calculateArea() {
        return length * width;
    }
}

// -- CIRCLE --
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

 
    double calculateArea() {
        return 3.1416 * radius * radius;
    }
}


public class Q1 {
    public static void main(String[] args) {

        Shape r = new Rectangle(5, 4);
        r.displayShape();
        System.out.println("Rectangle Area: " + r.calculateArea());

        Shape c = new Circle(3);
        c.displayShape();
        System.out.println("Circle Area: " + c.calculateArea());
    }
}

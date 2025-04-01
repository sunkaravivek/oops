// Abstract class Shape
abstract class Shape {
    // Abstract methods (must be implemented by subclasses)
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    private int length;
    private int breadth;

    // Constructor
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}

// Circle class extending Shape
class Circle extends Shape {
    private int radius;

    // Constructor
    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Main class
public class AbstractClass1 {
    public static void main(String[] args) {
        // Creating a Rectangle object
        Shape rec = new Rectangle(2, 4);
        System.out.println("The area of the rectangle is: " + rec.calculateArea());
        System.out.println("The perimeter of the rectangle is: " + rec.calculatePerimeter());

        // Creating a Circle object
        Shape circle = new Circle(5);
        System.out.println("The area of the circle is: " + circle.calculateArea());
        System.out.println("The perimeter of the circle is: " + circle.calculatePerimeter());
    }
}

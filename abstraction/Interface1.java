interface Shape {
    double calculateArea();
    double calculatePerimeter();
}


class Rectangle implements Shape {
    private int length;
    private int breadth;

    
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


class Circle implements Shape {
    private int radius;

    
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


public class Interface1 {
    public static void main(String[] args) {
        
        Shape rec = new Rectangle(2, 4);
        System.out.println("The area of the rectangle is: " + rec.calculateArea());
        System.out.println("The perimeter of the rectangle is: " + rec.calculatePerimeter());

        
        Shape circle = new Circle(5);
        System.out.println("The area of the circle is: " + circle.calculateArea());
        System.out.println("The perimeter of the circle is: " + circle.calculatePerimeter());
    }
}

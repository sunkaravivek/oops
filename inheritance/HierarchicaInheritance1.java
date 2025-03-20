class Shape {
    
    public double area() {
        return 0.0;
    }

    
    public double perimeter() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width; 
    }

    public double perimeter() {
        return 2 * (length + width); 
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14 * radius * radius; 
    }

    public double perimeter() {
        return 2 *3.14 * radius; 
    }
}

public class HierarchicaInheritance1 {
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Rectangle Area: " + rectangle.area());            
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());  
        
        Circle circle = new Circle(4);
        System.out.println("Circle Area: " + circle.area());                 
        System.out.println("Circle Perimeter: " + circle.perimeter());       
    }
}

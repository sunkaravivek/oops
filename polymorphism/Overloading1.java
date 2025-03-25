class Shape {
   
    public double area(double side) {
        return side * side;
    }

    
    public double area(double length, double width) {
        return length * width;
    }

    
    public double area(double radius, boolean isCircle) {
        if (isCircle) {
            return Math.PI * radius * radius;
        }
        return 0;
    }
}

public class Overloading1 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Square: " + shape.area(4));              
        System.out.println("Rectangle: " + shape.area(4, 5));       
        System.out.println("Circle: " + shape.area(3, true));       
    }
}
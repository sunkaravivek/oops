class Calculator {

    
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
 
    public double add(double a, double b) {
        return a + b;
    }

    public String add(String s, int i){
        return s + i;
    }

    public String add(int i, String s){
        return i + s;
    }

}

public class Overloading2 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 integers: " + calc.add(5, 10)); 
        System.out.println("Sum of 3 integers: " + calc.add(5, 10, 15)); 
        System.out.println("Sum of 2 doubles: " + calc.add(5.5, 10.5)); 
        System.out.println("String plus int: " + calc.add("Result: ", 42)); 
        System.out.println("Int plus String: " + calc.add(42, " Result")); 
    }
}
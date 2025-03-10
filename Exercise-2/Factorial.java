import java.util.Scanner;

public class Factorial {
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) 
            return 1; 
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        System.out.println("Factorial of " + num + " is: " + factorial(num));
        scanner.close();
    }
}

import java.util.Scanner;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class ExceptionHandling4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter marks (0 to 100): ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Marks must be between 0 and 100");
            }

            System.out.println("Marks entered: " + marks);
            if (marks >= 50)
                System.out.println("Result: Pass");
            else
                System.out.println("Result: Fail");
        } 
        catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Please enter a valid number.");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for marks
        System.out.print("Enter your marks (0-100): ");
        int marks = scanner.nextInt();

        // Checking grade using if-else conditions
        if (marks >= 90) {
            System.out.println("Grade: A+ (Excellent)");
        } else if (marks >= 80) {
            System.out.println("Grade: A (Very Good)");
        } else if (marks >= 70) {
            System.out.println("Grade: B (Good)");
        } else if (marks >= 60) {
            System.out.println("Grade: C (Satisfactory)");
        } else if (marks >= 50) {
            System.out.println("Grade: D (Pass)");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        scanner.close();
    }
}

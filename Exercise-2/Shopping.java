import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get total purchase amount
        System.out.print("Enter total shopping amount: ");
        double amount = scanner.nextDouble();
        double discount = 0;

        // Apply discount based on amount
        if (amount >= 5000) {
            discount = amount * 0.20;  // 20% discount
        } 
        else if (amount >= 3000) {
            discount = amount * 0.15;  // 15% discount
        } 
        else if (amount >= 1000) {
            discount = amount * 0.10;  // 10% discount
        } 
        else {
            discount = amount * 0.05;  // 5% discount
        }

        double finalAmount = amount - discount;

        // Display results
        System.out.println("Total Amount: $" + amount);
        System.out.println("Discount Applied: $" + discount);
        System.out.println("Final Amount to Pay: $" + finalAmount);

        scanner.close();
    }
}

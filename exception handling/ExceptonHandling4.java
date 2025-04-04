import java.util.InputMismatchException;
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class ExceptonHandling4 {
    private static double balance = 5000.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("=== Welcome to Simple Bank System ===");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            try {
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        deposit(scanner);
                        break;
                    case 3:
                        withdraw(scanner);
                        break;
                    case 4:
                        System.out.println("Thank you for using the bank system.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select 1 to 4.");
                }
            } 
            catch (InputMismatchException e) {
                System.out.println("Please enter a number.");
                scanner.nextLine();
                choice = 0; 
            }

        } while (choice != 4);

        scanner.close();
    }

    public static void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void deposit(Scanner scanner) {
        try {
            System.out.print("Enter deposit amount: ");
            double amount = scanner.nextDouble();

            if (amount <= 0) {
                System.out.println("Amount must be greater than zero.");
                return;
            }

            balance += amount;
            System.out.println("Deposit successful.");
            checkBalance();
        } 
        catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
            scanner.nextLine();
        }
    }

    public static void withdraw(Scanner scanner) {
        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();

            if (amount <= 0) {
                System.out.println("Amount must be greater than zero.");
                return;
            }

            if (amount > balance) {
                throw new InsufficientBalanceException("Not enough balance.");
            }

            balance -= amount;
            System.out.println("Withdrawal successful.");
            checkBalance();
        } 
        catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
            scanner.nextLine(); 
        } 
        catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

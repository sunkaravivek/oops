
class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String holder, int accNumber, double initialBalance) {
        accountHolder = holder;
        accountNumber = accNumber;
        balance = initialBalance;
        System.out.println("Account Created for " + accountHolder);
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    void displayAccount() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class constructor {
    public static void main(String[] args) {
        
        BankAccount acc1 = new BankAccount("muzzammil", 101234, 5000);
        BankAccount acc2 = new BankAccount("roopesh", 102345, 3000);

        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.displayAccount();

        System.out.println(); 

        acc2.deposit(500);
        acc2.withdraw(4000); 
        acc2.displayAccount();
    }
}

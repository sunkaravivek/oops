class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance must be positive.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Encapsulation2{
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        
        account.deposit(500);
        account.withdraw(300);
        account.withdraw(2000);  

        System.out.println("Current Balance: " + account.getBalance());
    }
}

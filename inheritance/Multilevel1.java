class BankAccount {
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance() {
        System.out.println("Balance: $" + balance);
    }
}


class SavingsAccount extends BankAccount {
    void addInterest() {
        double interest = balance * 0.05;
        balance += interest;
        System.out.println("Interest added: $" + interest);
    }
}


class SpecialSavingsAccount extends SavingsAccount {
    void offerBonus() {
        if (balance > 5000) {
            balance += 100; // Bonus for maintaining high balance
            System.out.println("Bonus added: $100");
        } else {
            System.out.println("No bonus added. Maintain $5000+ balance.");
        }
    }
}

public class BankExample {
    public static void main(String[] args) {
        SpecialSavingsAccount acc = new SpecialSavingsAccount();
        
        acc.deposit(6000);
        acc.addInterest();
        acc.offerBonus();
        acc.displayBalance();
    }
}

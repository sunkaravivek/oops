
public class Interface3 {
    public static void main(String[] args) {
        Account account = new SpecialSavingsAccount(6000, 5.0);

        account.deposit(1000);
        account.withdraw(500);
        ((SpecialSavingsAccount) account).offerBonus();
        System.out.println("Current Balance: $" + account.getBalance());
    }
}

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class BankAccount implements Account {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added: $" + interest);
    }
}

class SpecialSavingsAccount extends SavingsAccount {
    public SpecialSavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance, interestRate);
    }

    public void offerBonus() {
        if (getBalance() > 5000) {
            deposit(100); // Bonus for maintaining a high balance
            System.out.println("Bonus added: $100");
        } else {
            System.out.println("No bonus added. Maintain a balance over $5000.");
        }
    }
}

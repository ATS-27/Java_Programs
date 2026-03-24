import java.util.ArrayList;
import java.util.List;
// Base Class
abstract class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + " to " + accountNumber);
        }
    }

    // Abstract to force specific logic in child classes
    public abstract void withdraw(double amount);

    public String getDetails() {
        return "Account: " + accountNumber + " | Balance: ₹" + balance;
    }
}




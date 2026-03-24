// Savings Account: Standard withdrawal logic
class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from Savings " + accountNumber);
        } else {
            System.out.println("Insufficient funds in Savings " + accountNumber);
        }
    }
}
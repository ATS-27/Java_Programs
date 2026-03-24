// Loan Account: Deposits pay off the debt, Withdrawals increase debt
class LoanAccount extends Account {
    private double loanLimit;

    public LoanAccount(String accountNumber, double debt, double loanLimit) {
        super(accountNumber, debt); // Here balance represents the amount owed
        this.loanLimit = loanLimit;
    }

    @Override
    public void deposit(double amount) {
        balance -= amount; // Paying off the loan reduces the balance (debt)
        System.out.println("Loan Payment of ₹" + amount + " received for " + accountNumber);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + amount <= loanLimit) {
            balance += amount; // Taking more loan increases the balance (debt)
            System.out.println("Loan withdrawal of ₹" + amount + " processed.");
        } else {
            System.out.println("Loan limit exceeded!");
        }
    }

    @Override
    public String getDetails() {
        return "Loan Account: " + accountNumber + " | Outstanding Debt: ₹" + balance;
    }
}
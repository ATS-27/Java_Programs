import java.util.ArrayList;

public class BankingApp {
    public static void main(String[] args) {
        // List of Customers
        ArrayList<Customer> customers = new ArrayList<>();

        // Setup Customer 1
        Customer c1 = new Customer("Atherva Sri");
        c1.addAccount(new SavingsAccount("SAV-101", 5000.0));
        c1.addAccount(new LoanAccount("LOAN-202", 15000.0, 50000.0));
        
        // Setup Customer 2
        Customer c2 = new Customer("Aadya Rastogi");
        c2.addAccount(new SavingsAccount("SAV-303", 1200.0));

        customers.add(c1);
        customers.add(c2);

        // Display Consolidated Information
        System.out.println(" GLOBAL BANKING REPORT ");
        for (Customer c : customers) {
            c.displayProfile();
        }
    }
}
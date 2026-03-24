import java.util.ArrayList;
import java.util.List;

// Customer Class
class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void displayProfile() {
        System.out.println("\n--- Customer: " + name + " ---");
        for (Account acc : accounts) {
            System.out.println(acc.getDetails());
        }
    }
}
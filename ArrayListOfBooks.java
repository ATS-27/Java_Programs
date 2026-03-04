import java.util.ArrayList;

public class ArrayListOfBooks {
    public static void main(String[] args) {
        ArrayList<Book> bList = new ArrayList<>();

        // 1. Try to create a book with a negative price
        try {
            System.out.println("--- Attempting to add a book with negative price ---");
            Book badBook = new Book("Glitch", "Error Maker", -15.00, "Tech", "123-X");
            bList.add(badBook);
        } catch (InvalidPriceException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        // 2. Add valid books
        try {
            bList.add(new Book("Eclipse", "Stephenie Mayer", 455.96, "Fiction", "978-01"));
            bList.add(new Book("Atomic Habits", "James Clear", 899.99, "Self-Help", "978-02"));
            bList.add(new Book("The Hobbit", "J.R.R. Tolkien", 550.00, "Fiction", "978-03"));
        } catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
        }

        // 3. Display all attributes & calculate average
        System.out.println("\n--- All Books in Library ---");
        double totalPrice = 0;
        for (Book b : bList) {
            System.out.println(b);
            totalPrice += b.price;
        }

        if (!bList.isEmpty()) {
            System.out.println("\nAverage Price: $" + (totalPrice / bList.size()));
        }

        // 4. Print only "Fiction" books using forEach
        System.out.println("\n--- Fiction Books ---");
        bList.forEach(book -> {
            if ("Fiction".equalsIgnoreCase(book.genre)) {
                System.out.println(book.name + " by " + book.authorName);
            }
        });
    }
}
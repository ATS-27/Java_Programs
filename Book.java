import java.time.LocalDate;

public class Book {
    public String name;
    public String authorName;
    public double price;
    public String genre;
    public String ISBN;
    public String publisherName;
    public LocalDate dateOfPublishing;
    
    // Default Constructor
    public Book() {
        this.name = "Unknown";
        this.price = 0.0;
        this.authorName = "Unknown";
        this.publisherName = "unspecified";
        this.genre = "uncategorised";
        this.ISBN = "0000000";
        this.dateOfPublishing = LocalDate.parse("2020-01-01");
    }

    // Parameterized Constructor with Exception Handling
    public Book(String name, String author, double price, String genre, String isbn) throws InvalidPriceException {
        if (price < 0) {
            throw new InvalidPriceException("Price cannot be negative: " + price);
        }
        this.name = name;
        this.authorName = author;
        this.price = price;
        this.genre = genre;
        this.ISBN = isbn;
    }

    @Override
    public String toString() {
        return String.format("Title: %s | Author: %s | Price: $%.2f | Genre: %s", 
                              name, authorName, price, genre);
    }
}
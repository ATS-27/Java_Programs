import java.util.*;

// Product Interface
interface Product {
    void displayDetails();
}

// LegacyItem Class
class LegacyItem {
    private int itemId;
    private String description;

    public LegacyItem(int itemId, String description) {
        this.itemId = itemId;
        this.description = description;
    }

    public void print() {
        System.out.println("Legacy Item -> ID: " + itemId + ", Description: " + description);
    }
}

// ProductAdapter Class (Adapter Pattern)
class ProductAdapter implements Product {
    private LegacyItem legacyItem;

    public ProductAdapter(LegacyItem legacyItem) {
        this.legacyItem = legacyItem;
    }

    @Override
    public void displayDetails() {
        legacyItem.print();
    }
}

// NewProduct Class
class NewProduct implements Product {
    private String name;

    public NewProduct(String name) {
        this.name = name;
    }

    @Override
    public void displayDetails() {
        System.out.println("New Product -> Name: " + name);
    }
}

// InventoryManager Class (Singleton Pattern)
class InventoryManager {
    private static InventoryManager instance;
    private List<Product> products;

    private InventoryManager() {
        products = new ArrayList<>();
    }

    public static InventoryManager getInstance() {
        if (instance == null) {
            instance = new InventoryManager();
        }
        return instance;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Iterator<Product> returnInventory() {
        return products.iterator();
    }
}

// Main Class
public class DesignPattern
 {
    public static void main(String[] args) {

        // Single instance of InventoryManager
        InventoryManager manager = InventoryManager.getInstance();

        // Adding New Products
        manager.addProduct(new NewProduct("Laptop"));
        manager.addProduct(new NewProduct("Mobile"));

        // Adding Legacy Products using Adapter
        LegacyItem item1 = new LegacyItem(101, "Old Keyboard");
        LegacyItem item2 = new LegacyItem(102, "Old Mouse");

        manager.addProduct(new ProductAdapter(item1));
        manager.addProduct(new ProductAdapter(item2));

        // Iterator Pattern
        Iterator<Product> iterator = manager.returnInventory();

        System.out.println("Inventory Details:");
        while (iterator.hasNext()) {
            Product product = iterator.next();
            product.displayDetails();
        }
    }
}
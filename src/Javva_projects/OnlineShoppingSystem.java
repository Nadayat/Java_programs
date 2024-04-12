package Javva_projects;

import java.util.*;

// Product class to represent each item available for sale
class Product {
    private int id;
    private String name;
    private double price;
    public int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

// ShoppingCart class to manage the items in the user's shopping cart
class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public void removeItem(int productId) {
        items.removeIf(item -> item.getId() == productId);
    }

    public List<Product> getItems() {
        return items;
    }

    public double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }
}

// Main class representing the online shopping system
public class OnlineShoppingSystem {
    private Map<Integer, Product> products;
    private ShoppingCart cart;

    public OnlineShoppingSystem() {
        products = new HashMap<>();
        cart = new ShoppingCart();
    }

    // Method to add products to the system
    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    // Method to display available products
    public void displayProducts() {
        for (Product product : products.values()) {
            System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Price: $" + product.getPrice());
        }
    }

    // Method to add a product to the shopping cart
    public void addToCart(int productId) {
        if (products.containsKey(productId)) {
            Product product = products.get(productId);
            if (product.getQuantity() > 0) {
                cart.addItem(product);
                product.quantity--;
                System.out.println("Product added to cart.");
            } else {
                System.out.println("Sorry, the product is out of stock.");
            }
        } else {
            System.out.println("Invalid product ID.");
        }
    }

    // Method to remove a product from the shopping cart
    public void removeFromCart(int productId) {
        cart.removeItem(productId);
        Product product = products.get(productId);
        product.quantity++;
        System.out.println("Product removed from cart.");
    }

    // Method to display items in the shopping cart
    public void displayCart() {
        List<Product> items = cart.getItems();
        if (items.isEmpty()) {
            System.out.println("Your shopping cart is empty.");
        } else {
            System.out.println("Items in your shopping cart:");
            for (Product item : items) {
                System.out.println("ID: " + item.getId() + ", Name: " + item.getName() + ", Price: $" + item.getPrice());
            }
            System.out.println("Total: $" + cart.calculateTotal());
        }
    }

    public static void main(String[] args) {
        OnlineShoppingSystem system = new OnlineShoppingSystem();

        // Adding some sample products
        system.addProduct(new Product(1, "Laptop", 999.99, 5));
        system.addProduct(new Product(2, "Smartphone", 499.99, 10));
        system.addProduct(new Product(3, "Headphones", 99.99, 20));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Display Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. Remove from Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    system.displayProducts();
                    break;
                case 2:
                    System.out.print("Enter product ID to add to cart: ");
                    int productId = scanner.nextInt();
                    system.addToCart(productId);
                    break;
                case 3:
                    System.out.print("Enter product ID to remove from cart: ");
                    int removeProductId = scanner.nextInt();
                    system.removeFromCart(removeProductId);
                    break;
                case 4:
                    system.displayCart();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}

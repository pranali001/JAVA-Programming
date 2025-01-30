import java.util.ArrayList;

// Class to represent a product
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}

// Class to represent the shopping cart
class ShoppingCart {
    private ArrayList<Product> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cart.add(product);
    }

    public void removeProduct(String productName) {
        boolean productFound = false;
        for (Product product : cart) {
            if (product.getName().equalsIgnoreCase(productName)) {
                cart.remove(product);
                productFound = true;
                break; // Exit the loop after removing the product
            }
        }
        if (!productFound) {
            System.out.println("Product not found in the cart.");
        }
    }

    public void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Products in your cart:");
            for (Product product : cart) {
                System.out.println(product);
            }
        }
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Product product : cart) {
            total += product.getPrice();
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 800.00);
        Product product2 = new Product("SmartPhone", 500.00);
        Product product3 = new Product("HeadPhone", 50.00);

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        cart.viewCart();

        cart.removeProduct("SmartPhone");

        System.out.println("After removing SmartPhone:");
        cart.viewCart();

        System.out.println("Total price: $" + cart.calculateTotal());
    }
}

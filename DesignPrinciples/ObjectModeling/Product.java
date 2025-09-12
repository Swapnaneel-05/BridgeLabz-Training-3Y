package BridgeLabz.OOPSJava.ObjectModeling;
import java.util.*;

public class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

class Order{
    private String orderId;
    private List<Product> products;

    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public String getOrderId() {
        return orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        double total = 0;
        for (Product p : products) {
            System.out.println("- " + p.getProductName() + " | Price: " + p.getPrice());
            total += p.getPrice();
        }
        System.out.println("Total: " + total);
    }
}

class Customer{
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed order " + order.getOrderId());
    }

    public void showCustomerOrders() {
        System.out.println("Orders for " + name + ":");
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}

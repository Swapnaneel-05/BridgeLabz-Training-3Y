package BridgeLabz.OOPSJava.ObjectModeling;

public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Smartphone", 20000);
        Product p3 = new Product("Headphones", 2000);

        Order order1 = new Order("O1001");
        order1.addProduct(p1);
        order1.addProduct(p3);

        Order order2 = new Order("O1002");
        order2.addProduct(p2);

        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        c1.placeOrder(order1);
        c2.placeOrder(order2);

        c1.showCustomerOrders();
        c2.showCustomerOrders();
    }
}

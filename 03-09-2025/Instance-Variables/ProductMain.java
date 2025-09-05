package BridgeLabz.OOPSJava.InstanceVariable;

public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000.0);
        Product p2 = new Product("Mobile", 25000.0);

        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}

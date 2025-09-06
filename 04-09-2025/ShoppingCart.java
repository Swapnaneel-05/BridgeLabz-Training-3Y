package BridgeLabz.OOPSJava.Sep4th;

public class ShoppingCart {
    static double discount = 10.0;

    private String productName;
    private double price;
    private int quantity;
    private final int productID;

    ShoppingCart(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public void displayProductDetails() {
        if (this instanceof ShoppingCart) {
            double totalCost = (price * quantity) - ((price * quantity) * discount / 100);
            System.out.println("Product ID: " + productID +
                               ", Name: " + productName +
                               ", Price: " + price +
                               ", Quantity: " + quantity +
                               ", Discount: " + discount + "%" +
                               ", Total Cost: " + totalCost);
        } else {
            System.out.println("Invalid product object");
        }
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
}

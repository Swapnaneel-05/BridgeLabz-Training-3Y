package BridgeLabz.OOPSJava;

public class CartItemMain {
    public static void main(String[] args) {
        CartItem mycart= new CartItem();

        mycart.addItem("Phone", 23000, 1);
        mycart.displayCart();
        mycart.removeItem();
        mycart.displayCart();
    }
}

package BridgeLabz.OOPSJava.Sep4th;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart p1=new ShoppingCart("Laptop",40000 , 1, 103);

        p1.displayProductDetails();

        ShoppingCart.updateDiscount(20);

        System.out.println("After updating discount:");

        p1.displayProductDetails();
    }
}

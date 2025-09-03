package BridgeLabz.OOPSJava;

public class CartItem {
    String itemName;
    int price;
    int quantity;
    public CartItem(){
        this.itemName="";
        this.price=0;
        this.quantity=0;
    }

    public void addItem(String itemName, int price, int quantity){
        if (this.quantity == 0) { 
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
            System.out.println(itemName + " added to cart.");
        } else {
            System.out.println("Cart already has an item,Remove");
        }
    }

    public void removeItem(){
        if (this.quantity > 0) {
            System.out.println(itemName + " removed from cart.");
            this.itemName = "";
            this.price = 0;
            this.quantity = 0;
        } else {
            System.out.println("Cart is already empty.");
        }
    }

    int totalCost(){
        return price*quantity;
    }

    void displayCart(){
        if (this.quantity > 0) {
            System.out.println("\nCart Item:");
            System.out.println("Item: " + itemName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total: " + totalCost());
        } else {
            System.out.println("\nCart is empty.");
        }
    }
}

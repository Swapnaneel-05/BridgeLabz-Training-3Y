package BridgeLabz.OOPSJava;

public class Item {
    int itemCode;
    String itemName;
    int price;
    public Item(int itemCode,String itemName,int price){
        this.itemName=itemName;
        this.itemCode=itemCode;
        this.price=price;
    }
    public void displayItem(){
        System.out.println("item code: "+itemCode);
        System.out.println("Item Name: "+itemName);
        System.out.println("Price: "+price);
    }
    public int totalCost(int quantity){
        return quantity*price;
    }
}

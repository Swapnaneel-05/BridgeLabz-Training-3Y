package BridgeLabz.OOPSJava;

public class ItemMain {
    public static void main(String[] args) {
        Item it=new Item(001, "Pen", 10);
        it.displayItem();
        System.out.println("Total Cost: "+it.totalCost(5));
    }
}

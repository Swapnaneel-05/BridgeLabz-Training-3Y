package BridgeLabz.OOPSJava;

public class PersonMain {
    public static void main(String[] args) {
        Person ps= new Person("Rahul",56);
        Person ps2=new Person(ps);

        ps2.display();
    }
}

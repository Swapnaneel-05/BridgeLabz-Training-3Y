package BridgeLabz.OOPSJava.Inheritance;

public class PersonMain {
    public static void main(String[] args) {
        Teacher t = new Teacher("Alice", 35, "Mathematics");
        Student s = new Student("Bob", 16, 10);
        Staff st = new Staff("Charlie", 40, "Administration");

        t.displayRole();
        t.displayDetails();
        
        s.displayRole();
        s.displayDetails();
        
        st.displayRole();
        st.displayDetails();
    }
}

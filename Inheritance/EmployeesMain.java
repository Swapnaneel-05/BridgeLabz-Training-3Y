package BridgeLabz.OOPSJava.Inheritance;

public class EmployeesMain {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 101, 80000, 10);
        Developer d = new Developer("Bob", 102, 60000, "Java");
        Intern i = new Intern("Charlie", 103, 20000, 6);

        m.displayDetails();
        d.displayDetails();
        i.displayDetails();
    }
}

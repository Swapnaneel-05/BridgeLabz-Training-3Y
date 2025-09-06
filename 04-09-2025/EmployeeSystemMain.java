package BridgeLabz.OOPSJava.Sep4th;

public class EmployeeSystemMain {
    public static void main(String[] args) {
        EmployeeSystem e1 = new EmployeeSystem("Ravi", 101, "Developer");

        e1.displayEmployeeDetails();
        EmployeeSystem.displayTotalEmployees();
    }
}

package BridgeLabz.OOPSJava.AccessModifier;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "HR", 40000);
        e1.displayEmployee();
        e1.setSalary(45000);
        System.out.println("Updated Salary: " + e1.getSalary());

        Manager m1 = new Manager(201, "IT", 80000, "Development Team");
        m1.displayManager();
    }
}

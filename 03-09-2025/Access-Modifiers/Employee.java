package BridgeLabz.OOPSJava.AccessModifier;

public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeID +
                           ", Department: " + department +
                           ", Salary: " + salary);
    }
}

class Manager extends Employee {
    String teamName;

    Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    public void displayManager() {
        System.out.println("Manager ID: " + employeeID +
                           ", Department: " + department +
                           ", Salary: " + getSalary() +
                           ", Team: " + teamName);
    }
}

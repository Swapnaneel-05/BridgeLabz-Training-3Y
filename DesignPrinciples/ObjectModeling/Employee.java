package BridgeLabz.OOPSJava.ObjectModeling;
import java.util.*;
class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void showDetails() {
        System.out.println("Employee: " + name + ", Role: " + role);
    }
}

class Department{
    private String deptName;
    private List<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name, String role) {
        employees.add(new Employee(name, role));
    }

    public void showEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.showDetails();
        }
    }
}

class Company{
    private String companyName;
    private List<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void showCompanyStructure() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showEmployees();
        }
    }

    public void closeCompany() {
        System.out.println("\nClosing company " + companyName + "...");
        departments.clear();
        System.out.println("All departments and employees are deleted.");
    }
}

package BridgeLabz.OOPSJava;

public class Employee {
    String name;
    int id;
    int salary;
    public Employee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displayDetails(Employee emp){
        System.out.println("EmployeeID- "+emp.id+" : "+emp.name+"'s salary is: "+emp.salary);
    }
}

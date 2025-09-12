package BridgeLabz.OOPSJava.ObjectModeling;

public class EmployeeMain {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        Department d1 = new Department("IT");
        d1.addEmployee("Alice", "Software Engineer");
        d1.addEmployee("Bob", "System Admin");

        Department d2 = new Department("HR");
        d2.addEmployee("Charlie", "HR Manager");

        company.addDepartment(d1);
        company.addDepartment(d2);

        company.showCompanyStructure();

        company.closeCompany();
    }
}

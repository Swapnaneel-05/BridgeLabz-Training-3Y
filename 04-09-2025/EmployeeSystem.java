package BridgeLabz.OOPSJava.Sep4th;

public class EmployeeSystem {
    static String companyName = "Tech Solutions Ltd";
    private static int totalEmployees = 0;

    private String name;
    private String designation;
    private final int id;

    EmployeeSystem(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public void displayEmployeeDetails() {
        if (this instanceof EmployeeSystem) {
            System.out.println("Company: " + companyName +
                               ", Name: " + name +
                               ", ID: " + id +
                               ", Designation: " + designation);
        } else {
            System.out.println("Invalid employee object");
        }
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

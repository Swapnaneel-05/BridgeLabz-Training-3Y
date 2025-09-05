package BridgeLabz.OOPSJava.AccessModifier;

public class Student {
    public int rollNumber;      
    protected String name;      
    private double CGPA;       

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if (CGPA >= 0 && CGPA <= 10) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Must be between 0 and 10.");
        }
    }

    public void displayStudent() {
        System.out.println("Roll Number: " + rollNumber +
                           ", Name: " + name +
                           ", CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPostgraduateStudent() {
        System.out.println("PG Student - Roll Number: " + rollNumber +
                           ", Name: " + name +
                           ", CGPA: " + getCGPA() +
                           ", Specialization: " + specialization);
    }
}

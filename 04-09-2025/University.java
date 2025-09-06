package BridgeLabz.OOPSJava.Sep4th;

public class University {
    static String universityName = "GLA University";
    private static int totalStudents = 0;

    private String name;
    private String grade;
    private final int rollNumber;

    University(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public void displayStudentDetails() {
        if (this instanceof University) {
            System.out.println("University: " + universityName +
                               ", Name: " + name +
                               ", Roll Number: " + rollNumber +
                               ", Grade: " + grade);
        } else {
            System.out.println("Invalid student object");
        }
    }

    public void updateGrade(String newGrade) {
        if (this instanceof University) {
            this.grade = newGrade;
            System.out.println("Grade updated for " + name + " to " + grade);
        } else {
            System.out.println("Invalid student object");
        }
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
}

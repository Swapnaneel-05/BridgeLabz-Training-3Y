package BridgeLabz.OOPSJava.Sep4th;

public class UniversityMain {
    public static void main(String[] args) {
        University s1 = new University("Ravi", 101, "A");

        s1.displayStudentDetails();
        s1.updateGrade("O");
        University.displayTotalStudents();
    }
}

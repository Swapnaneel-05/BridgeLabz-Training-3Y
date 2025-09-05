package BridgeLabz.OOPSJava.AccessModifier;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Ravi", 8.2);
        s1.displayStudent();

        s1.setCGPA(9.1);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Neha", 9.0, "Computer Science");
        pg1.displayPostgraduateStudent();
    }
}

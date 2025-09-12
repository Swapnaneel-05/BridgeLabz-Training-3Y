package BridgeLabz.OOPSJava.ObjectModeling;

public class CourseMain {
    public static void main(String[] args) {
        School school = new School("Green Valley School");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        
        school.addStudent(s1);
        school.addStudent(s2);

        
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Physics");

        
        c1.enrollStudent(s1);
        c1.enrollStudent(s2);
        c2.enrollStudent(s1);

        
        school.showStudents();

       
        s1.viewCourses();
        s2.viewCourses();

        
        c1.showEnrolledStudents();
        c2.showEnrolledStudents();
    }    
}

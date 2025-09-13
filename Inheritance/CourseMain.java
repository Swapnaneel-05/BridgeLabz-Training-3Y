package BridgeLabz.OOPSJava.Inheritance;

public class CourseMain {
    public static void main(String[] args) {
        Course c1 = new Course("Mathematics", 12);
        OnlineCourse c2 = new OnlineCourse("Java Programming", 8, "Udemy", true);
        PaidOnlineCourse c3 = new PaidOnlineCourse("Data Structures", 10, "Coursera", true, 5000, 20);

        c1.displayInfo();
        System.out.println("-----");
        c2.displayInfo();
        System.out.println("-----");
        c3.displayInfo();
    }
}

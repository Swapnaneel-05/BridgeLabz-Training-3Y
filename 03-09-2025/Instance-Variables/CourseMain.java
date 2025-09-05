package BridgeLabz.OOPSJava.InstanceVariable;

public class CourseMain {
    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 3, 15000.0);

        c1.displayCourseDetails();
        
        Course.updateInstituteName("XYZ Academy");

        c1.displayCourseDetails();
    }
}

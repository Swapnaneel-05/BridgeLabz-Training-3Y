package BridgeLabz.OOPSJava.ObjectModeling;

public class FacultyMain {
    public static void main(String[] args) {
        University uni = new University("Global University");

        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Mathematics");

        Faculty f1 = new Faculty("Dr. Alice");
        Faculty f2 = new Faculty("Dr. Bob");

        uni.addDepartment(d1);
        uni.addDepartment(d2);

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showStructure();

        uni.closeUniversity();
        uni.showStructure();
    }
}

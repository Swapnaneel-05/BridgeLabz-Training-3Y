package BridgeLabz.OOPSJava.ObjectModeling;

public class SubjectMain {
    public static void main(String[] args) {
        University uni = new University("Tech University");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Professor p1 = new Professor("Dr. Smith");
        Professor p2 = new Professor("Dr. Johnson");

        Subject sub1 = new Subject("Data Structures");
        Subject sub2 = new Subject("Operating Systems");

        uni.addStudent(s1);
        uni.addStudent(s2);
        uni.addProfessor(p1);
        uni.addProfessor(p2);

        p1.assignSubject(sub1);
        p2.assignSubject(sub2);

        s1.enrollSubject(sub1);
        s1.enrollSubject(sub2);
        s2.enrollSubject(sub1);

        uni.showUniversityData();

        sub1.showSubjectDetails();
        sub2.showSubjectDetails();

        s1.showSubjects();
        s2.showSubjects();

        p1.showSubjects();
        p2.showSubjects();
    
    }
}

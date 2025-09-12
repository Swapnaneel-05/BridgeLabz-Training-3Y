package BridgeLabz.OOPSJava.ObjectModeling;

import java.util.ArrayList;
import java.util.List;

class Subject {
    private String subjectName;
    private Professor professor;
    private List<Student> students;

    public Subject(String subjectName) {
        this.subjectName = subjectName;
        this.students = new ArrayList<>();
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.getName() + " assigned to " + subjectName);
    }

    public void enrollStudent(Student student) {
        students.add(student);
        System.out.println("Student " + student.getName() + " enrolled in " + subjectName);
    }

    public void showSubjectDetails() {
        System.out.println("Subject: " + subjectName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        } else {
            System.out.println("No professor assigned yet.");
        }
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

class Student {
    private String name;
    private List<Subject> subjects;

    public Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollSubject(Subject subject) {
        subjects.add(subject);
        subject.enrollStudent(this);
    }

    public void showSubjects() {
        System.out.println("Subjects for " + name + ":");
        for (Subject s : subjects) {
            System.out.println("- " + s.getSubjectName());
        }
    }
}

class Professor {
    private String name;
    private List<Subject> subjects;

    public Professor(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignSubject(Subject subject) {
        subjects.add(subject);
        subject.assignProfessor(this);
    }

    public void showSubjects() {
        System.out.println("Subjects taught by " + name + ":");
        for (Subject s : subjects) {
            System.out.println("- " + s.getSubjectName());
        }
    }
}

class University {
    private String universityName;
    private List<Student> students;
    private List<Professor> professors;

    public University(String universityName) {
        this.universityName = universityName;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void showUniversityData() {
        System.out.println("University: " + universityName);
        System.out.println("Students:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
        System.out.println("Professors:");
        for (Professor p : professors) {
            System.out.println("- " + p.getName());
        }
    }
}

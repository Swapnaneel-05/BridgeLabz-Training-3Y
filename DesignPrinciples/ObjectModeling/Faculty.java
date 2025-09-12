package BridgeLabz.OOPSJava.ObjectModeling;

import java.util.*;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String deptName;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}

class University{
    private String universityName;
    private List<Department> departments;
    private List<Faculty> faculties;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showStructure() {
        System.out.println("University: " + universityName);
        System.out.println("Departments:");
        for (Department d : departments) {
            System.out.println("- " + d.getDeptName());
        }
        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            System.out.println("- " + f.getName());
        }
    }

    public void closeUniversity() {
        System.out.println("Closing " + universityName);
        departments.clear();
        System.out.println("All departments are deleted. Faculties remain.");
    }
}

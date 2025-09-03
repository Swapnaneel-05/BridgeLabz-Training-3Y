package BridgeLabz.OOPSJava;

public class Student {
    String name;
    int rollNumber;
    int marks;
    public Student(String name,int rollNumber,int marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }
    public String gradeCalculate(){
        if(marks>=90){
            return"Grade A";
        }
        else if(marks>=75){
            return "B";
        }
        else if(marks>=50){
            return "C";
        }
        else{
            return "D";
        }
    }
    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("RollNumber: "+rollNumber);
        System.out.println("Marks: "+marks);
        System.out.println("Grade: "+gradeCalculate());
    }
}

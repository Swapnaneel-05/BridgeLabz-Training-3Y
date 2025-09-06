package BridgeLabz.OOPSJava.Sep4th;

public class Hospital {
    static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    private String name;
    private int age;
    private String ailment;
    private final int patientID;

    Hospital(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public void displayPatientDetails() {
        if (this instanceof Hospital) {
            System.out.println("Hospital: " + hospitalName +
                               ", Name: " + name +
                               ", Age: " + age +
                               ", Ailment: " + ailment +
                               ", Patient ID: " + patientID);
        } else {
            System.out.println("Invalid patient object");
        }
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }
}

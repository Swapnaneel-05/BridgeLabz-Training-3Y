package BridgeLabz.OOPSJava.Sep4th;

public class HospitalMain {
    public static void main(String[] args) {
        Hospital p1 = new Hospital("Ravi", 30, "Fever", 101);
        Hospital p2 = new Hospital("Neha", 45, "Diabetes", 102);

        p1.displayPatientDetails();
        p2.displayPatientDetails();

        Hospital.getTotalPatients();
    }
}

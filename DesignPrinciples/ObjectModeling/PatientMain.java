package BridgeLabz.OOPSJava.ObjectModeling;

public class PatientMain {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Smith");
        Doctor d2 = new Doctor("Johnson");

        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        d1.showPatients();
        d2.showPatients();

        p1.showDoctors();
        p2.showDoctors();

        hospital.showHospitalData();
    }
}

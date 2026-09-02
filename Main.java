public class Main {

    public static void main(String[] args) {

        Patient patient = new Patient(
            101,
            "Kamal",
            35,
            "0771234567",
            "Fever"
        );

        System.out.println("---- PATIENT INFORMATION ----");

        patient.displayPatient();
    }
}
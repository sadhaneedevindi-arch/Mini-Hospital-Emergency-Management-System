public class Main {

    public static void main(String[] args) {

        PatientBST bst = new PatientBST();

        Patient patient1 = new Patient(
            105,
            "Kamal",
            35,
            "0771234567",
            "Fever"
        );

        Patient patient2 = new Patient(
            102,
            "Nimal",
            28,
            "0712345678",
            "Headache"
        );

        Patient patient3 = new Patient(
            110,
            "Sunil",
            45,
            "0755555555",
            "Injury"
        );

        bst.insert(patient1);
        bst.insert(patient2);
        bst.insert(patient3);

        System.out.println("---- BEFORE DELETE ----");

        Patient foundPatient = bst.search(102);

        if (foundPatient != null) {
            foundPatient.displayPatient();
        }

        bst.delete(102);

        System.out.println("\n---- AFTER DELETE ----");

        foundPatient = bst.search(102);

        if (foundPatient != null) {
            foundPatient.displayPatient();
        } else {
            System.out.println("Patient 102 was deleted successfully.");
        }
    }
}
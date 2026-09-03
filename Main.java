public class Main {

    public static void main(String[] args) {

        // Create BST
        PatientBST bst = new PatientBST();

        // Create patients
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

        // Insert patients
        bst.insert(patient1);
        bst.insert(patient2);
        bst.insert(patient3);

        // Search for patient
        System.out.println("---- SEARCH PATIENT ----");

        int searchId = 102;

        Patient foundPatient = bst.search(searchId);

        if (foundPatient != null) {
            System.out.println("Patient found!");
            foundPatient.displayPatient();
        } else {
            System.out.println("Patient not found.");
        }
    }
}
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

        Patient patient4 = new Patient(
            101,
            "Amal",
            30,
            "0766666666",
            "Cold"
        );

        Patient patient5 = new Patient(
            108,
            "Saman",
            40,
            "0788888888",
            "Back Pain"
        );

        bst.insert(patient1);
        bst.insert(patient2);
        bst.insert(patient3);
        bst.insert(patient4);
        bst.insert(patient5);

        System.out.println("===== PATIENTS IN ASCENDING ORDER =====");

        bst.inOrder();
    }
}
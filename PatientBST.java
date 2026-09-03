public class PatientBST {

    class Node {

        Patient patient;
        Node left;
        Node right;

        Node(Patient patient) {
            this.patient = patient;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    public void insert(Patient patient) {
        root = insertRecursive(root, patient);
    }

    private Node insertRecursive(Node root, Patient patient) {

        if (root == null) {
            return new Node(patient);
        }

        if (patient.patientId < root.patient.patientId) {
            root.left = insertRecursive(root.left, patient);
        }

        else if (patient.patientId > root.patient.patientId) {
            root.right = insertRecursive(root.right, patient);
        }

        return root;
    }
}
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

    public Patient search(int patientId) {

        Node result = searchRecursive(root, patientId);

        if (result != null) {
            return result.patient;
        }

        return null;
    }

    private Node searchRecursive(Node root, int patientId) {

        if (root == null) {
            return null;
        }

        if (root.patient.patientId == patientId) {
            return root;
        }

        if (patientId < root.patient.patientId) {
            return searchRecursive(root.left, patientId);
        }

        return searchRecursive(root.right, patientId);
    }

    public void delete(int patientId) {

        root = deleteRecursive(root, patientId);
    }

    private Node deleteRecursive(Node root, int patientId) {

        if (root == null) {
            return null;
        }

        if (patientId < root.patient.patientId) {

            root.left = deleteRecursive(root.left, patientId);
        }

        else if (patientId > root.patient.patientId) {

            root.right = deleteRecursive(root.right, patientId);
        }

        else {

            if (root.left == null && root.right == null) {
                return null;
            }

            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            Node successor = findMinimum(root.right);

            root.patient = successor.patient;

            root.right = deleteRecursive(
                root.right,
                successor.patient.patientId
            );
        }

        return root;
    }

    private Node findMinimum(Node root) {

        while (root.left != null) {
            root = root.left;
        }

        return root;
    }
}
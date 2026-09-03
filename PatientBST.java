public class PatientBST {

    // Node represents one patient in the BST
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

    // Root of the tree
    Node root;
}
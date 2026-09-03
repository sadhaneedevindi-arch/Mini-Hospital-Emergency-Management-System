public class EmergencyQueue {

    class Node {

        Patient patient;
        Node next;

        Node(Patient patient) {
            this.patient = patient;
            this.next = null;
        }
    }

    Node front;
    Node rear;

    public EmergencyQueue() {
        front = null;
        rear = null;
    }
}
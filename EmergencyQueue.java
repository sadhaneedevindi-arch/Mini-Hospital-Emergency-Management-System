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

    public void enqueue(Patient patient) {

        Node newNode = new Node(patient);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        }

        else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public Patient dequeue() {

        if (front == null) {
            System.out.println("Emergency queue is empty.");
            return null;
        }

        Patient patient = front.patient;

        front = front.next;

        if (front == null) {
            rear = null;
        }

        return patient;
    }
}
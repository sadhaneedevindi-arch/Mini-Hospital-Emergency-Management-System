public class TreatmentStack {

    class Node {

        TreatmentRecord record;
        Node next;

        Node(TreatmentRecord record) {
            this.record = record;
            this.next = null;
        }
    }

    Node top;

    public TreatmentStack() {
        top = null;
    }

    public void push(TreatmentRecord record) {

        Node newNode = new Node(record);

        newNode.next = top;
        top = newNode;
    }

    public TreatmentRecord pop() {

        if (top == null) {
            System.out.println("Treatment history stack is empty.");
            return null;
        }

        TreatmentRecord record = top.record;

        top = top.next;

        return record;
    }
}
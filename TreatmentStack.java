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
}
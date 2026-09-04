public class VisitHistory {

    class Node {

        Visit visit;
        Node next;

        Node(Visit visit) {
            this.visit = visit;
            this.next = null;
        }
    }

    Node head;

    public VisitHistory() {
        head = null;
    }
}
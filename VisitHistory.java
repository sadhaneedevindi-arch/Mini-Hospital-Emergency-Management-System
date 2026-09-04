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

    public void addVisit(Visit visit) {

        Node newNode = new Node(visit);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public Visit searchVisit(int visitId) {

        Node current = head;

        while (current != null) {

            if (current.visit.visitId == visitId) {
                return current.visit;
            }

            current = current.next;
        }

        return null;
    }
}
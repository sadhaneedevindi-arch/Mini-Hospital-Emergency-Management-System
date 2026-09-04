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

    public void removeVisit(int visitId) {

        if (head == null) {
            System.out.println("Visit history is empty.");
            return;
        }

        if (head.visit.visitId == visitId) {
            head = head.next;
            System.out.println("Visit removed successfully.");
            return;
        }

        Node current = head;

        while (current.next != null &&
            current.next.visit.visitId != visitId) {

                current = current.next;
        }

        if (current.next != null) {

            current.next = current.next.next;

            System.out.println("Visit removed successfully.");
        } else {

            System.out.println("Visit not found.");
        }
    }

    public void displayVisits() {

        if (head == null) {
            System.out.println("Visit history is empty.");
            return;
        }

        Node current = head;

        System.out.println("---- PATIENT VISIT HISTORY ----");

        while (current != null) {

            current.visit.displayVisit();

            System.out.println("--------------------");

            current = current.next;
        }
    }
}
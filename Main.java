public class Main {

    public static void main(String[] args) {

        VisitHistory history = new VisitHistory();

        history.addVisit(new Visit(
            1,
            "2026-08-01",
            "Dr. Silva",
            "Fever",
            "Medication"
        ));

        history.addVisit(new Visit(
            2,
            "2026-08-15",
            "Dr. Perera",
            "Headache",
            "Pain relief"
        ));

        System.out.println("---- SEARCH VISIT ----");

        Visit found = history.searchVisit(2);

        if (found != null) {
            System.out.println("Visit found!");
            found.displayVisit();
        } else {
            System.out.println("Visit not found.");
        }
    }
}
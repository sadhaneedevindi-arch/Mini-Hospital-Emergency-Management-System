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

        history.addVisit(new Visit(
            3,
            "2026-09-01",
            "Dr. Fernando",
            "Injury",
            "Wound dressing"
        ));

        System.out.println("Removing Visit ID 2.");

        history.removeVisit(2);
    }
}
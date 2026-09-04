public class Main {

    public static void main(String[] args) {

        Visit visit = new Visit(
            1,
            "2026-09-01",
            "Dr. Silva",
            "Fever",
            "Medication"
        );

        System.out.println("---- VISIT INFORMATION ----");

        visit.displayVisit();
    }
}
public class Main {

    public static void main(String[] args) {

        TreatmentRecord record = new TreatmentRecord(
            1,
            101,
            "Dr. Silva",
            "Fever medication"
        );

        System.out.println("---- TREATMENT RECORD ----");

        record.displayTreatment();
    }
}
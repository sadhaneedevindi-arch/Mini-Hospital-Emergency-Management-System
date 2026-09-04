public class Main {

    public static void main(String[] args) {

        TreatmentStack stack = new TreatmentStack();

        TreatmentRecord treatment1 = new TreatmentRecord(
            1,
            101,
            "Dr. Silva",
            "Fever medication"
        );

        TreatmentRecord treatment2 = new TreatmentRecord(
            2,
            102,
            "Dr. Perera",
            "Headache medication"
        );

        TreatmentRecord treatment3 = new TreatmentRecord(
            3,
            103,
            "Dr. Fernando",
            "Wound treatment"
        );

        // Add treatments to stack
        stack.push(treatment1);
        stack.push(treatment2);
        stack.push(treatment3);

        System.out.println("Treatments added to stack successfully.");
    }
}
public class Main {

    public static void main(String[] args) {

        TreatmentStack stack = new TreatmentStack();

        stack.push(new TreatmentRecord(
            1,
            101,
            "Dr. Silva",
            "Fever medication"
        ));

        stack.push(new TreatmentRecord(
            2,
            102,
            "Dr. Perera",
            "Headache medication"
        ));

        stack.push(new TreatmentRecord(
            3,
            103,
            "Dr. Fernando",
            "Wound treatment"
        ));

        stack.displayStack();
    }
}
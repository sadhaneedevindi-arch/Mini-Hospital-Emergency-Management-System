public class Main {

    public static void main(String[] args) {

        EmergencyQueue queue = new EmergencyQueue();

        Patient patient1 = new Patient(
            101, "Kamal", 35,
            "0771234567", "Fever"
        );

        Patient patient2 = new Patient(
            102, "Nimal", 28,
            "0712345678", "Headache"
        );

        Patient patient3 = new Patient(
            103, "Sunil", 45,
            "0755555555", "Injury"
        );

        queue.enqueue(patient1);
        queue.enqueue(patient2);
        queue.enqueue(patient3);

        queue.displayQueue();
    }
}
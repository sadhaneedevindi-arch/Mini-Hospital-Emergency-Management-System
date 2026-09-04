public class TreatmentRecord {

    int treatmentId;
    int patientId;
    String doctorName;
    String treatmentDescription;

    public TreatmentRecord(
        int treatmentId,
        int patientId,
        String doctorName,
        String treatmentDescription
    ) {

        this.treatmentId = treatmentId;
        this.patientId = patientId;
        this.doctorName = doctorName;
        this.treatmentDescription = treatmentDescription;
    }

    public void displayTreatment() {

        System.out.println("Treatment ID: " + treatmentId);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Doctor: " + doctorName);
        System.out.println("Treatment: " + treatmentDescription);
    }
}
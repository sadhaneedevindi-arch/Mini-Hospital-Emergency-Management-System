import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static PatientBST patientBST = new PatientBST();
    static EmergencyQueue emergencyQueue = new EmergencyQueue();
    static TreatmentStack treatmentStack = new TreatmentStack();

    // Store visit history for demonstration
    static VisitHistory visitHistory = new VisitHistory();

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n----------------------------------");
            System.out.println(" MINI HOSPITAL EMERGENCY SYSTEM");
            System.out.println("----------------------------------");
            System.out.println("1. Patient Records");
            System.out.println("2. Emergency Queue");
            System.out.println("3. Treatment History");
            System.out.println("4. Patient Visit History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    patientMenu();
                    break;

                case 2:
                    queueMenu();
                    break;

                case 3:
                    treatmentMenu();
                    break;

                case 4:
                    visitMenu();
                    break;

                case 5:
                    System.out.println("Thank you for using the system.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        scanner.close();
    }


    public static void patientMenu() {

        int choice;

        do {

            System.out.println("\n---- PATIENT RECORDS ----");
            System.out.println("1. Add Patient");
            System.out.println("2. Search Patient");
            System.out.println("3. Delete Patient");
            System.out.println("4. Display Patients");
            System.out.println("5. Back");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    addPatient();
                    break;

                case 2:
                    searchPatient();
                    break;

                case 3:
                    deletePatient();
                    break;

                case 4:
                    patientBST.inOrder();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }

    public static void addPatient() {

        System.out.print("Patient ID: ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Patient Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Contact Number: ");
        String contact = scanner.nextLine();

        System.out.print("Medical Condition: ");
        String condition = scanner.nextLine();

        Patient patient = new Patient(
            id,
            name,
            age,
            contact,
            condition
        );

        patientBST.insert(patient);

        System.out.println("Patient added successfully.");
    }

    public static void searchPatient() {

        System.out.print("Enter Patient ID: ");
        int id = scanner.nextInt();

        Patient patient = patientBST.search(id);

        if (patient != null) {
            System.out.println("Patient found!");
            patient.displayPatient();
        } else {
            System.out.println("Patient not found.");
        }
    }

    public static void deletePatient() {

        System.out.print("Enter Patient ID to delete: ");
        int id = scanner.nextInt();

        patientBST.delete(id);

        System.out.println("Delete operation completed.");
    }


    public static void queueMenu() {

        int choice;

        do {

            System.out.println("\n---- EMERGENCY QUEUE ----");
            System.out.println("1. Add Patient to Queue");
            System.out.println("2. Treat Next Patient");
            System.out.println("3. Display Waiting Patients");
            System.out.println("4. Back");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    addPatientToQueue();
                    break;

                case 2:
                    treatNextPatient();
                    break;

                case 3:
                    emergencyQueue.displayQueue();
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }

    public static void addPatientToQueue() {

        System.out.print("Patient ID: ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Patient Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Contact Number: ");
        String contact = scanner.nextLine();

        System.out.print("Medical Condition: ");
        String condition = scanner.nextLine();

        Patient patient = new Patient(
            id,
            name,
            age,
            contact,
            condition
        );

        emergencyQueue.enqueue(patient);

        System.out.println("Patient added to emergency queue.");
    }

    public static void treatNextPatient() {

        Patient patient = emergencyQueue.dequeue();

        if (patient != null) {

            System.out.println("---- PATIENT FOR TREATMENT ----");

            patient.displayPatient();
        }
    }


    public static void treatmentMenu() {

        int choice;

        do {

            System.out.println("\n---- TREATMENT HISTORY ----");
            System.out.println("1. Add Treatment");
            System.out.println("2. Remove Latest Treatment");
            System.out.println("3. Display Treatment History");
            System.out.println("4. Back");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    addTreatment();
                    break;

                case 2:
                    removeTreatment();
                    break;

                case 3:
                    treatmentStack.displayStack();
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }

    public static void addTreatment() {

        System.out.print("Treatment ID: ");
        int treatmentId = scanner.nextInt();

        System.out.print("Patient ID: ");
        int patientId = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Doctor Name: ");
        String doctor = scanner.nextLine();

        System.out.print("Treatment Description: ");
        String description = scanner.nextLine();

        TreatmentRecord record = new TreatmentRecord(
            treatmentId,
            patientId,
            doctor,
            description
        );

        treatmentStack.push(record);

        System.out.println("Treatment added successfully.");
    }

    public static void removeTreatment() {

        TreatmentRecord record = treatmentStack.pop();

        if (record != null) {

            System.out.println("Most recent treatment removed:");

            record.displayTreatment();
        }
    }


    public static void visitMenu() {

        int choice;

        do {

            System.out.println("\n---- PATIENT VISIT HISTORY ----");
            System.out.println("1. Add Visit");
            System.out.println("2. Search Visit");
            System.out.println("3. Remove Visit");
            System.out.println("4. Display Visits");
            System.out.println("5. Back");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    addVisit();
                    break;

                case 2:
                    searchVisit();
                    break;

                case 3:
                    removeVisit();
                    break;

                case 4:
                    visitHistory.displayVisits();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }

    public static void addVisit() {

        System.out.print("Visit ID: ");
        int visitId = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Visit Date: ");
        String date = scanner.nextLine();

        System.out.print("Doctor Name: ");
        String doctor = scanner.nextLine();

        System.out.print("Diagnosis: ");
        String diagnosis = scanner.nextLine();

        System.out.print("Treatment: ");
        String treatment = scanner.nextLine();

        Visit visit = new Visit(
            visitId,
            date,
            doctor,
            diagnosis,
            treatment
        );

        visitHistory.addVisit(visit);

        System.out.println("Visit added successfully.");
    }

    public static void searchVisit() {

        System.out.print("Enter Visit ID: ");
        int id = scanner.nextInt();

        Visit visit = visitHistory.searchVisit(id);

        if (visit != null) {

            System.out.println("Visit found!");

            visit.displayVisit();

        } else {

            System.out.println("Visit not found.");
        }
    }

    public static void removeVisit() {

        System.out.print("Enter Visit ID to remove: ");
        int id = scanner.nextInt();

        visitHistory.removeVisit(id);
    }
}
# Mini Hospital Emergency Management System

## Project Description

The Mini Hospital Emergency Management System is a Java-based system designed to manage basic hospital patient information and emergency activities.



## Objectives

The main objectives of this system are:

- To manage patient records efficiently.
- To search and delete patient records using Patient ID.
- To manage emergency patients using a queue.
- To store completed treatment records using a stack.
- To maintain patient visit history using a singly linked list.
- To demonstrate the practical use of data structures in a hospital environment.

## Data Structures

### 1. Binary Search Tree (BST)

The Binary Search Tree is used to store and manage patient records.

Patient ID is used as the key for the BST.

Operations implemented:

- Insert patient
- Search patient
- Delete patient
- In-order traversal

The in-order traversal displays patients in ascending order according to Patient ID.

### 2. Queue

The Queue is used to manage patients waiting for emergency treatment.

Operations implemented:

- Enqueue patient
- Dequeue patient
- Display waiting patients
- Empty queue handling

The queue follows the FIFO (First-In, First-Out) principle.

### 3. Stack

The Stack is used to store completed treatment records.

Operations implemented:

- Push treatment record
- Pop the latest treatment record
- Display treatment history
- Empty stack handling

The stack follows the LIFO (Last-In, First-Out) principle.

### 4. Singly Linked List

The Singly Linked List is used to store patient visit history.

Operations implemented:

- Add visit
- Search visit
- Remove visit
- Display visit history

## Technologies Used

- Java
- Visual Studio Code
- Git
- GitHub

## Project Structure

```text
MiniHospitalSystem/
│
├── Main.java
├── Patient.java
├── PatientBST.java
├── EmergencyQueue.java
├── TreatmentRecord.java
├── TreatmentStack.java
├── Visit.java
├── VisitHistory.java
└── README.md
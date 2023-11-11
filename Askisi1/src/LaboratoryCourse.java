// Άσκηση 1.2
public class LaboratoryCourse implements LaboratoryCourseInterface{
    private String courseName;
    private int labsCapacity;
    private int labsNumber = 0;
    private Lab[] courseArray;
    public LaboratoryCourse() {
        // Default constructor
    }
    public LaboratoryCourse(String newCourseName) {
        // Semi constructor
        this (newCourseName, 5);
    }
    public LaboratoryCourse(String newCourseName, int newLabsCapacity) {
        // Full constructor
        this.courseName = newCourseName;
        this.labsCapacity = newLabsCapacity;
        courseArray = new Lab[newLabsCapacity];
    }

    // Setters-Getters
    public void setCourseName(String newCourseName) {
        this.courseName = newCourseName;
    }
    public String getCourseName() {
        return this.courseName;
    }

    public void setlabsCapacity(int newlabsCapacity) {
        this.labsCapacity = newlabsCapacity;
    }
    public int getlabsCapacity() {
        return this.labsCapacity;
    }

    public void setLabsNumber(int newLabsNumber) {
        this.labsNumber = newLabsNumber;
    }
    public int getLabsNumber() {
        return this.labsNumber;
    }
    // Μέθοδοι διαχείρισης δεδομένων
    public boolean insertLab(Lab newLab) {
        // Εισαγωγή νέου εργαστηρίου
        if (this.labsNumber >= this.labsCapacity) {
            System.out.println("Το εργαστηριακό μάθημα: " + this.courseName + " είναι πλήρες.");
            return false;
        }
        else {
            courseArray[this.labsNumber++] = newLab;
            return true;
        }
    }
    private int getNumberOfStudents() { // ΝΑ ΕΛΕΓΞΩ ΑΝ ΜΠΑΙΝΕΙ ΣΤΟ INTERFACE
        // Επιστρέφει τον συνολικό αριθμό των φοιτητών που παρακολουθούν το εργαστηριακό μάθημα
        int n = 0;
        for (int i = 0; i < this.labsNumber; i++)
            n = n + this.courseArray[i].getLabCurrentSize();
        return n;
    }
    private int[] successStatus() { // ΝΑ ΕΛΕΓΞΩ ΑΝ ΜΠΑΙΝΕΙ ΣΤΟ INTERFACE
        // Επιστρέφει το πλήθος τον φοιτητών που πέτυχαν-απέτυχαν στο μάθημα ανά εργαστήριο και συνολικά για το εργαστηριακό μάθημα
        int[] pin = new int[2 * this.labsNumber + 2]; // ΓΙΑΤΙ ΓΙΝΕΤΑΙ ΑΥΤΟ;
        int succeeded = 0;
        int failed = 0;
        for (int i = 0; i < this.labsNumber; i++) { // ΓΙΑΤΙ ΓΙΝΕΤΑΙ ΑΥΤΟ;
            pin[i] = courseArray[i].succededStudents();
            succeeded = succeeded + courseArray[i].succededStudents();
        }
        for (int i = 0; i < this.labsNumber; i++) { // ΓΙΑΤΙ ΓΙΝΕΤΑΙ ΑΥΤΟ;
            pin[i + labsNumber] = courseArray[i].failedStudents();
            failed = failed + courseArray[i].failedStudents();
        }
        pin[2 * this.labsNumber] = succeeded; // ΓΙΑΤΙ ΓΙΝΕΤΑΙ ΑΥΤΟ;
        pin[2 * this.labsNumber + 1] = failed; // ΓΙΑΤΙ ΓΙΝΕΤΑΙ ΑΥΤΟ;
        return pin;
    }
    // Implementation of LaboratoryCourseInterface interface methods
    public void printTotalNumberOfStudents() {
            // Εκτυπώνει τον συνολικό αριθμό των φοιτητών που παρακολουθούν το εργαστηριακό μάθημα
            System.out.print("Ο συνολικός αριθμός των φοιτητών που παρακολουθούν το εργαστηριακό μάθημα [" +
                    this.courseName + "] είναι: " + this.getNumberOfStudents());
    }
    public void printSuccessStatus() {
        // Εκτυπώνει το πλήθος τον φοιτητών που πέτυχαν-απέτυχαν στο μάθημα ανά εργαστήριο και συνολικά για το εργαστηριακό μάθημα
        int[] pin = successStatus();
        for (int i = 0; i < labsNumber; i++) {
            System.out.println("Εργαστήριο: " + this.courseArray[i].getLabName() +
                    "\nΕπιτυχόντες φοιτητές: " + pin[i] +
                    "\nΦοιτητές που απέτυχαν: " + pin[i + this.labsNumber]);
        }
        System.out.println("Το μάθημα: " + this.courseName +
                pin[2 * this.labsNumber] + " φοιτητές το πέρασαν και " +
                pin[2 * this.labsNumber + 1] + " φοιτητές απέτυχαν.");
    }
    public void printAverages() {
        // Εκτυπώνει το μέσο όρο του βαθμού των φοιτητών ανά εργαστήριο
    }
    public void printTotalCourceAverage() {
        // Εκτυπώνει το συνολικό μέσο όρο για το μάθημα
        double sum = 0;
        for (int i = 0; i < this.labsNumber; i++)
            sum = sum + this.courseArray[i].averageGrade();
        System.out.println("Ο συνολικός Μέσος Όρος βαθμολογίας για το μάθημα: " + this.courseName +
                " είναι " + sum / this.labsNumber);
    }
    public void printSuccessStatistics() {
        // Εκτυπώνει τα ποσοστά επιτυχίας και αποτυχίας ανά εργαστήριο και συνολικά για το μάθημα
        int[] pin = successStatus();
        for (int i = 0; i < labsNumber; i++) {
            System.out.println("Στο εργαστήριο: " + this.courseArray[i].getLabName() +
                    "\n" + 100 * (float)pin[i] / (this.courseArray[i].getLabCurrentSize()) + " ποσοστό φοιτητών πέτυχαν, ενώ " +
                    "\n" + 100 * (float)pin[i + this.labsNumber] / (this.courseArray[i].getLabCurrentSize()) + " ποσοστό φοιτητών απέτυχαν");
        }
        System.out.println("Στο μάθημα: " + this.courseName +
                "\n" + 100 * (float)pin[2 * this.labsNumber] / this.getNumberOfStudents() + " ποσοστό φοιτητών πέτυχαν, ενω " +
                "\n" + 100 * (float)pin[2 * this.labsNumber + 1] / this.getNumberOfStudents() + " ποσοστό φοιτητών απέτυχαν");
    }
}

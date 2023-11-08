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
    public LaboratoryCourse(String newCourseName, int newLabsNumber) {
        // Full constructor
        this.courseName = newCourseName;
        this.labsCapacity = 0;
        this.labsNumber = newLabsNumber;
        courseArray = new Lab[newLabsNumber];
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
        if (this.labsNumber > this.labsCapacity) {
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
        for (int i = 0; i < labsNumber; i++)
            n = n + courseArray[i].getLabCurrentSize();
        return n;
    }
    private int[] successStatus() { // ΝΑ ΕΛΕΓΞΩ ΑΝ ΜΠΑΙΝΕΙ ΣΤΟ INTERFACE
        // Επιστρέφει το πλήθος τον φοιτητών που πέτυχαν-απέτυχαν στο μάθημα ανά εργαστήριο και συνολικά για το εργαστηριακό μάθημα
        int[] pin = new int[2 * this.labsNumber];
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
    public void printTotalNumberOStudents() {
            // Εκτυπώνει τον συνολικό αριθμό των φοιτητών που παρακολουθούν το εργαστηριακό μάθημα
            System.out.print("Ο συνολικός αριθμός των φοιτητών που παρακολουθούν το εργαστηριακό μάθημα [" +
                    this.courseName + "] είναι: " + this.getNumberOfStudents());
    }
    public void printSuccessStatus() {
        // Εκτυπώνει το πλήθος τον φοιτητών που πέτυχαν-απέτυχαν στο μάθημα ανά εργαστήριο και συνολικά για το εργαστηριακό μάθημα
        int[] pin = successStatus();
    }
    public void printAverages() {
        // Εκτυπώνει το μέσο όρο του βαθμού των φοιτητών ανά εργαστήριο και το συνολικό μέσο όρο για το μάθημα
    }
    public void printSuccessStatistics() {
        // Εκτυπώνει τα ποσοστά επιτυχίας και αποτυχίας ανά εργαστήριο και συνολικά για το μάθημα
    }


}

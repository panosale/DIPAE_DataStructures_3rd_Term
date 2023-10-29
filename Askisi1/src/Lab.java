public class Lab implements LabInterface{
    private String labName;
    private int labCapacity;
    private int labCurrentSize = 0;
    private Student[] labArray;
    public Lab() {
        // Default constructor
    }
    public Lab(String newLabName, int newLabCapacity) {
        // Full constructor
        this.labName = newLabName;
        this.labCapacity = newLabCapacity;
        labArray = new Student[newLabCapacity];
        System.out.println("Το εργαστήριο '" + newLabName + "', με χωρητικότητα " + newLabCapacity + " ατόμων δημιουργήθηκε με επιτυχία.");
    }
    public Lab(String newLabName) {
        // Semi constructor
        this(newLabName, 20); // Default capacity given here
    }

    // Setters-Getters
    public void setLabName(String labName) {
        this.labName = labName;
    }
    public String getLabName() {
        return this.labName;
    }

    public void setLabCapacity(int labCapacity) {
        this.labCapacity = labCapacity;
    }

    public int getLabCapacity() {
        return this.labCapacity;
    }

    public void setLabCurrentSize(int labCurrentSize) {
        this.labCurrentSize = labCurrentSize;
    }

    public int getLabCurrentSize() {
        return this.labCurrentSize;
    }

    public void getLabArray() {
        for (int i = 0; i < this.labCurrentSize; i++)
            System.out.println("Φοιτητής [" + (i+1) + "]: \n" + this.labArray[i].toString() + "\n");
    }

    public boolean insertStudent(Student std) {
        // Εισαγωγή φοιτητή στο τμήμα
        if (this.labCurrentSize >= this.labCapacity) {
            System.out.println("Lab '" + this.labName + "' is full.");
            return false;
        }
        else {
            this.labArray[labCurrentSize++] = std;
            return true;
        }
    }

    public boolean deleteStudent(Student std) {
        // Διαγραφή φοιτητή από το τμήμα
        for (int i = 0; i < this.labCurrentSize; i++)
            if (this.labArray[i] == std) // Αν ο φοιτητής που θέλω να διαγράψω βρεθεί στη θέση i τότε ...
            { //... μεταφέρω στη θέση i τον φοιτητή από την τελευταία θέση του πίνακα μειώνω το μέγεθος του πίνακα κατά 1 ...
                this.labArray[i] = this.labArray[--this.labCurrentSize];
                return true; // ... και επιστρέφω true (έγινε η αφαίρεση)
            }
        return false; // Αν δεν βρεθεί φοιτητής επιστρέφω false.
    }

    public Student searchStudent(int am) {
        // Αναζήτηση φοιτητή στο τμήμα με ΑΜ
        for (int i = 0; i < this.labCurrentSize; i++)
            if (this.labArray[i].getAM() == am)
                return this.labArray[i];
        return null;
    }

    public void parousiologio() {
        // Εκτύπωση του παρουσιολογίου του τμήματος
        for (int i = 0; i < this.labCurrentSize; i++) {
            System.out.println("Φοιτητής: " + this.labArray[i].getAM() + ", " + this.labArray[i].getLastName() + " " + this.labArray[i].getFirstName()
                    + ". Απουσίες: " + this.labArray[i].getArithmosApousion() + ". Βαθμός: " + this.labArray[i].getVathmos());
        }
    }

    public int succededStudents() {
        // Υπολογισμός επιτυχόντων φοιτητών (με βαθμό πάνω από 5 και απουσίες κάτω από 2)
        int succeded = 0;
        for (int i = 0; i < this.labCurrentSize; i++)
            if ((this.labArray[i].getVathmos() >= 5) && (this.labArray[i].getArithmosApousion() <= 2))
                succeded++;
        return succeded;
    }

    public int failedStudents() {
        // Υπολογισμός φοιτητών που δεν πέρασαν (με βαθμό κάτω από 5 και απουσίες πάνω από 2)
        return (this.labCurrentSize - this.succededStudents());
    }

    public double averageGrade() {
        double sum = 0.0;
        for (int i = 0; i < this.labCurrentSize; i++)
            sum = sum + this.labArray[i].getVathmos();
        return sum / this.getLabCurrentSize();
    }
}

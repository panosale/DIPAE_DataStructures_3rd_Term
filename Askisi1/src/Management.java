import javax.swing.*;

public class Management {
    public static void manageCourse(LaboratoryCourse course) {
        int userSelection = -1;
        Student tmpStud = new Student();
        do {
            System.out.println("*** ΕΠΙΛΟΓΕΣ ΔΙΑΧΕΙΡΙΣΗΣ ΤΜΗΜΑΤΟΣ ***");
            System.out.println("1. Εισαγωγή νέου φοιτητή και προσθήκη σε εργαστήριο");
            System.out.println("2. Αναζήτηση φοιτητή με ΑΜ");
            System.out.println("3. Διαγραφή φοιτητή");
            System.out.println("0. Έξοδος");
            System.out.print("Παρακαλώ επίλεξε εργασία: ");
            userSelection = UserInput.getInteger();
            switch (userSelection) {
                case 1 -> {
                    System.out.println("ΕΙΣΑΓΩΓΗ ΦΟΙΤΗΤΗ...");
                    tmpStud = createNewStudent();
                    System.out.println("ΠΡΟΣΘΗΚΗ ΦΟΙΤΗΤΗ ΣΕ ΕΡΓΑΣΤΗΡΙΟ...");
                    addStudentToLab(tmpStud, course);
                }
                case 2 -> System.out.println("you seletced 2\n");
                case 3 -> System.out.println("you seletced 3\n");
                case 0 -> System.out.println("Bye bye...");
                default -> System.out.println("Προσοχή! Λάθος επιλογή!");
            }
        } while (userSelection != 0);
    }
    private static Student createNewStudent() {
        Student tmpStudent = new Student();
        String promptGenderSuffix = "";
        System.out.print("Δώσε το φύλο του φοιτητή/της φοιτήτριας (Άνδρας= Α ή M, Γυναίκα= Γ ή Θ ή F): ");
        char studentGender = UserInput.getChar();
        if (studentGender == 'Α' || studentGender == 'α' || studentGender == 'm' || studentGender == 'M') {
            promptGenderSuffix = "του φοιτητή: ";
            tmpStudent.setFylo('Α');
        }
        else
            if (studentGender == 'Γ' || studentGender == 'γ' || studentGender == 'Θ' || studentGender == 'θ' || studentGender == 'F' || studentGender == 'f') {
                promptGenderSuffix = "της φοιτήτριας: ";
                tmpStudent.setFylo('Γ');
            }
            else {
                System.out.println("Προσοχή! Λάθος επιλογή φύλου. Τερματισμός εισαγωγής!");
                return null;
            }
        System.out.print("Δώσε τον Αριθμό Μητρώου " + promptGenderSuffix);
            tmpStudent.setAM(UserInput.getInteger());
        System.out.print("Δώσε το Όνομα " + promptGenderSuffix);
            tmpStudent.setFirstName(UserInput.getString());
        System.out.print("Δώσε το Επίθετο " + promptGenderSuffix);
            tmpStudent.setLastName(UserInput.getString());
        System.out.print("Δώσε τη Ηλικία " + promptGenderSuffix);
            tmpStudent.setHlikia(UserInput.getInteger());
        System.out.print("Δώσε τον Βαθμό " + promptGenderSuffix);
            tmpStudent.setVathmos(UserInput.getDouble());
        System.out.print("Δώσε τον Αριθμό Απουσιών " + promptGenderSuffix);
            tmpStudent.setArithmosApousion(UserInput.getInteger());
        return tmpStudent;
    }
    public static void addStudentToLab(Student stud, LaboratoryCourse course) {

        System.out.println("Διαθέσιμα τμήματα και ελεύθερες θέσεις ανα τμήμα:" + course.getLabsNumber());
        for (int i = 0; i < course.getLabsNumber(); i++) {
            System.out.println("Εργαστήριο: " + course.getCourseLabs()[i].getLabName() + ", Χωρητικότητα: " + course.getCourseLabs()[i].getLabCapacity() +
                    ", Ελεύθερες: " + (course.getCourseLabs()[i].getLabCapacity() - course.getCourseLabs()[i].getLabCurrentSize()));
        }
        System.out.print("Επιλέξτε εργαστήριο εισαγωγής: ");
    }
}

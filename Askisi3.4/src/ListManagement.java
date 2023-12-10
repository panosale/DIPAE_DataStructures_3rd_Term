import javax.swing.plaf.synth.SynthRadioButtonUI;
import java.lang.reflect.GenericDeclaration;

// ΑΣΚΗΣΗ 3.4
public class ListManagement {
    public static StudentsLinkedList manageList(StudentsLinkedList tmp_studentsList) {
        int userSelection = -1;
        Student tmpStud = new Student();
        do {
            System.out.println("*** LINKED LIST MANAGEMENT ***");
            System.out.println("1. Insert element at the BEGINNING of the List");
            System.out.println("2. Insert element at the END of the List");
            System.out.println("3. Delete element from the BEGINNING of the List");
            System.out.println("4. Delete element from the END of the List");
            System.out.println("5. List length");
            System.out.println("6. Is the List Empty?");
            System.out.println("7. Print List");
            System.out.println("8. Sort List");
            System.out.println("0. Έξοδος");
            System.out.print("Insert you choice: ");
            userSelection = UserInput.getInteger();
            switch (userSelection) {
                case 1 -> {
                    System.out.println("INSERT ELEMENT AT THE BEGINNING OF THE LIST...");
                    tmpStud = createNewStudent();
                    if (tmpStud != null)
                        tmp_studentsList.insertFirst(tmpStud);
                    System.out.println("...DONE");
                }
                case 2 -> {
                    System.out.println("INSERT ELEMENT AT THE END OF THE LIST...");
                    tmpStud = createNewStudent();
                    if (tmpStud != null)
                        tmp_studentsList.insertLast(tmpStud);
                    System.out.println("...DONE");
                }
                case 3 -> {
                    System.out.println("DELETE ELEMENT FROM THE BEGINNING OF HE LIST...");
                    tmpStud = (Student) tmp_studentsList.removeFirst();
                    System.out.println("...DONE");
                }
                case 4 -> {
                    System.out.println("DELETE ELEMENT FROM THE END OF HE LIST...");
                    tmpStud = (Student) tmp_studentsList.removeLast();
                    System.out.println("...DONE");
                }
                case 5 -> {
                    System.out.println("LENGTH OF THE LIST IS: " + tmp_studentsList.getSize() + " ELEMENTS.");
                }
                case 6 -> {
                    if (tmp_studentsList.isEmpty())
                        System.out.println("LIST IS EMPTY.");
                    else
                        System.out.println("LIST IS NOT EMPTY.");
                }
                case 7 -> {
                    System.out.println("WHOLE LIST IS...");
                    tmp_studentsList.printList();
                }
                case 8 -> {
                    System.out.println("SORTING THE LIST...");
                    tmp_studentsList.sortList();
                    System.out.println("...DONE");
                }
                case 0 -> System.out.println("Bye bye...");
                default -> System.out.println("Wrong choice!");
            }
        } while (userSelection != 0);
        return tmp_studentsList;
    }
    private static Student createNewStudent() {
        Student tmpStudent = new Student();
        String promptGenderSuffix = "";
        System.out.print("Δώσε το φύλο του φοιτητή/της φοιτήτριας (Άνδρας= Α ή M, Γυναίκα= Γ ή Θ ή F): ");
        char studentGender = UserInput.getChar();
        // ΕΛΕΓΧΟΣ ΣΤΟ ΠΑΡΑΚΑΤΩ. ΚΑΤΙ ΔΕ ΛΕΙΤΟΥΡΓΕΙ ΣΩΣΤΑ
        if (studentGender == 'Α' || studentGender == 'α' || studentGender == 'A' || studentGender == 'a' || studentGender == 'Μ' || studentGender == 'M' || studentGender == 'm' ) {
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
}

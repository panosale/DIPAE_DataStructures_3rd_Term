// Άσκηση Πράξης 1
public class Main {
    public static void main(String[] args) {
        Student st1 = new Student(2022005, "Panos", "Alevropoulos", 47, 'Α', 5, 2);
        Student st2 = new Student(111, "Νικολετα", "Νικολάου", 27, 'Θ', 6, 1);
        Student st3 = new Student(222, "Γεώργιος", "Βασιλειάδης", 19, 'Α', 3, 3);
        Student st4 = new Student(333, "Ελένη", "Παπαδοπούλου", 18, 'Θ', 4.5, 1);
        System.out.println(st1.toString());
        System.out.println();
        System.out.println();
        Lab myLab = new Lab("Panos Lab", 10);
        System.out.println();
        myLab.insertStudent(st1);
        myLab.insertStudent(st2);
        myLab.insertStudent(st3);
        myLab.insertStudent(st4);
        myLab.getLabArray();
        System.out.println("***** Αναζήτηση φοιτητή με ΑΜ: 111");
        System.out.println(myLab.searchStudent(111));
        System.out.println();
        System.out.println("***** Αναζήτηση φοιτητή με ΑΜ: 1333");
        System.out.println(myLab.searchStudent(1333));
        System.out.println("***** Εκτύπωση παρουσιολογίου τμήματος.");
        myLab.parousiologio();
        System.out.println("***** Τρέχων μέγεθος τμήματος: " + myLab.getLabCurrentSize());
        System.out.println("***** Εκτύπωση επιτυχόντων φοιτητών του τμήματος.");
        System.out.println("Επιτυχόντες φοιτητές: " + myLab.succededStudents());
        System.out.println("***** Εκτύπωση φοιτητών που δεν τα κατάφεραν.");
        System.out.println("Αποτυχόντες φοιτητές: " + myLab.failedStudents());
        System.out.println("***** Εκτύπωση Μέσου Όρου βαθμολογίας του τμήματος.");
        System.out.println("Μέσος όρος: " + myLab.averageGrade());
        System.out.println("Πληροφορίες: " + myLab);
    }
}
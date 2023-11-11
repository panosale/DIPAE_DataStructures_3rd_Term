// Άσκηση Πράξης 1
public class Main {
    public static void main(String[] args) {
        Student st1 = new Student(2022005, "Panos", "Alevropoulos", 47, 'Α', 5, 2);
        Student st2 = new Student(222, "Νικολετα", "Νικολάου", 27, 'Θ', 6, 1);
        Student st3 = new Student(333, "Γεώργιος", "Βασιλειάδης", 19, 'Α', 3, 3);
        Student st4 = new Student(444, "Ελένη", "Παπαδοπούλου", 20, 'Θ', 4.5, 2);
        Student st5 = new Student(555, "Μαρία", "Γεωργιάδου", 21, 'Θ', 6.4, 0);
        Student st6 = new Student(666, "Λουκάς", "Θωίδης", 23, 'Α', 7, 1);
        Student st7 = new Student(777, "Κωνσταντίνος", "Αργυρός", 20, 'Α', 6.2, 0);
        Student st8 = new Student(888, "Αλεξάνδρα", "Παπανίκα", 19, 'Θ', 3.1, 1);
        Student st9 = new Student(999, "Μαρία", "Αναστασιάδου", 21, 'Θ', 6.1, 2);
        Student st10 = new Student(101010, "Νικόλαος", "Γεωργίου", 20, 'Α', 7.7, 0);
        Student st11 = new Student(111111, "Φοίβος", "Δελιβοριάς", 22, 'Α', 6, 1);
        Student st12 = new Student(121212, "Απόστολος", "Ρίζος", 18, 'Α', 4.1, 3);
        System.out.println(st1);
        System.out.println();
        System.out.println();
        Lab lab1 = new Lab("Δομές Lab 1", 4);
        Lab lab2 = new Lab("Δομές Lab 2");
        Lab lab3 = new Lab("Δομές Lab 3");
        System.out.println();
        lab1.insertStudent(st1); lab1.insertStudent(st2); lab1.insertStudent(st3); lab1.insertStudent(st4);
        lab2.insertStudent(st5); lab2.insertStudent(st6); lab2.insertStudent(st7); lab2.insertStudent(st8); lab2.insertStudent(st9);
        lab3.insertStudent(st10); lab3.insertStudent(st11); lab3.insertStudent(st12);
        System.out.println("Φοιτητές εργαστηρίου: " + lab1.getLabName());
        lab1.getLabArray();
        System.out.println();
        System.out.println("Φοιτητές εργαστηρίου: " + lab2.getLabName());
        lab2.getLabArray();
        System.out.println();
        System.out.println("Φοιτητές εργαστηρίου: " + lab3.getLabName());
        lab3.getLabArray();
        System.out.println();
        int am2Search = 222;
        System.out.println("***** Αναζήτηση φοιτητή με ΑΜ: " + am2Search);
        System.out.println(lab1.searchStudent(am2Search));
        System.out.println();
        am2Search = 11333;
        System.out.println("***** Αναζήτηση φοιτητή με ΑΜ: " + am2Search);
        System.out.println(lab1.searchStudent(am2Search));
        System.out.println("***** Διαγραφή φοιτητή [" + st3.getLastName() + " " + st3.getFirstName() + "] από το εργαστήριο: " + lab1.getLabName());
        lab1.deleteStudent(st3);
        System.out.println("***** Εκτύπωση παρουσιολογίου εργαστηρίου:" + lab1.getLabName());
        lab1.parousiologio();
        System.out.println("***** Τρέχων μέγεθος εργαστηρίου: " + lab1.getLabCurrentSize());
        System.out.println("***** Εκτύπωση επιτυχόντων φοιτητών του εργαστηρίου.");
        System.out.println("Επιτυχόντες φοιτητές: " + lab1.succededStudents());
        System.out.println("***** Εκτύπωση φοιτητών που δεν τα κατάφεραν.");
        System.out.println("Αποτυχόντες φοιτητές: " + lab1.failedStudents());
        System.out.println("***** Εκτύπωση Μέσου Όρου βαθμολογίας του εργαστηρίου.");
        System.out.println("Μέσος όρος: " + lab1.averageGrade());
        System.out.println("***** Πληροφορίες *****\n" + lab1);

        LaboratoryCourse course = new LaboratoryCourse("Δομές Δεδομένων");
        course.insertLab(lab1);
        course.insertLab(lab2);
        course.insertLab(lab3);
        course.printTotalNumberOfStudents();
        course.printTotalCourceAverage();
        course.printSuccessStatus();
        course.printSuccessStatistics();
    }
}
// Άσκηση 2.5 & 2.6. Η Ουρά χειρίζεται μόνο αντικείμενα τύπου Object (πιο γενική χρήση)
// Παράδειγμα ουράς σε Java
public class Main {
    public static void main(String[] args) {
        System.out.println("***** Άσκηση 2.5 & 2.6. Η Στοίβα χειρίζεται μόνο αντικείμενα τύπου Object *****");
//        Student st1 = new Student(2022005, "Panos", "Alevropoulos", 47, 'Α', 5, 2);
//        Student st2 = new Student(222, "Νικολετα", "Νικολάου", 27, 'Θ', 6, 1);
//        Student st3 = new Student(333, "Γεώργιος", "Βασιλειάδης", 19, 'Α', 3, 3);
//        Student st4 = new Student(444, "Ελένη", "Παπαδοπούλου", 20, 'Θ', 4.5, 2);
//        Student st5 = new Student(555, "Μαρία", "Γεωργιάδου", 21, 'Θ', 6.4, 0);
//        Student studentsStack = new Student();
//        Student st6 = new Student(666, "Λουκάς", "Θωίδης", 23, 'Α', 7, 1);
//        Student st7 = new Student(777, "Κωνσταντίνος", "Αργυρός", 20, 'Α', 6.2, 0);
//        Student st8 = new Student(888, "Αλεξάνδρα", "Παπανίκα", 19, 'Θ', 3.1, 1);
//        Student st9 = new Student(999, "Μαρία", "Αναστασιάδου", 21, 'Θ', 6.1, 2);
//        Student st10 = new Student(101010, "Νικόλαος", "Γεωργίου", 20, 'Α', 7.7, 0);
//        Student st11 = new Student(111111, "Φοίβος", "Δελιβοριάς", 22, 'Α', 6, 1);
//        Student st12 = new Student(121212, "Απόστολος", "Ρίζος", 18, 'Α', 4.1, 3);
        ArrayQueue studentsStack = new ArrayQueue(3);
        Student tmpStud;
        System.out.println("***** Maximum Stack size is: " + studentsStack.getMaxQueueCapacity());
        System.out.println();
        tmpStud = new Student(2022005, "Panos", "Alevropoulos", 47, 'Α', 5, 2);
        studentsStack.enqueueElement(tmpStud); // Upcasting
        System.out.println("1) Student with AM: " + tmpStud.getAM() + " was add in Queue.");
        tmpStud = new Student(222, "Νικολετα", "Νικολάου", 27, 'Θ', 6, 1); // Upcasting
        studentsStack.enqueueElement(tmpStud); // Upcasting
        System.out.println("2) Student with AM: " + tmpStud.getAM() + " was add in Queue.");
        tmpStud = new Student(333, "Γεώργιος", "Βασιλειάδης", 19, 'Α', 3, 3); // Upcasting
        studentsStack.enqueueElement(tmpStud); // Upcasting
        System.out.println("2) Student with AM: " + tmpStud.getAM() + " was add in Queue.");
//      Αν ενεργοποιηθούν οι παρακάτω γραμμές γίνεται Υπερχείλιση της Ουράς
//        tmpStud = new Student(121212, "Απόστολος", "Ρίζος", 18, 'Α', 4.1, 3);
//        studentsStack.enqueueElement(tmpStud); // Upcasting
        System.out.println("\nΌλα τα στοιχεία της Ουράς είναι:");
        studentsStack.showAllQueueElements(tmpStud, 4);
        System.out.println();
        tmpStud = (Student)studentsStack.dequeueElement();
//        System.out.println("1) Student with AM: " + tmpStud.getAM() + " was removed from the Stack.");
//        tmpStud = (Student)studentsStack.dequeueElement();
//        System.out.println("2) Student with AM: " + tmpStud.getAM() + " was removed from the Stack.");
//        tmpStud = (Student)studentsStack.dequeueElement();
//        System.out.println("3) Student with AM: " + tmpStud.getAM() + " was removed from the Stack.");
//        System.out.println("\nΌλα τα στοιχεία της Ουράς είναι:");
//        studentsStack.showAllQueueElements(tmpStud, 2);
//        System.out.println();
    }
}
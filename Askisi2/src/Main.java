// Άσκηση 2
// Παράδειγμα στοίβας σε Java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!\nToday we are testing Stack Data Structure with Java");
        Student st1 = new Student(2022005, "Panos", "Alevropoulos", 47, 'Α', 5, 2);
        Student st2 = new Student(222, "Νικολετα", "Νικολάου", 27, 'Θ', 6, 1);
        Student st3 = new Student(333, "Γεώργιος", "Βασιλειάδης", 19, 'Α', 3, 3);
        Student st4 = new Student(444, "Ελένη", "Παπαδοπούλου", 20, 'Θ', 4.5, 2);
        Student st5 = new Student(555, "Μαρία", "Γεωργιάδου", 21, 'Θ', 6.4, 0);
        Student tmpStud = new Student();
//        Student st6 = new Student(666, "Λουκάς", "Θωίδης", 23, 'Α', 7, 1);
//        Student st7 = new Student(777, "Κωνσταντίνος", "Αργυρός", 20, 'Α', 6.2, 0);
//        Student st8 = new Student(888, "Αλεξάνδρα", "Παπανίκα", 19, 'Θ', 3.1, 1);
//        Student st9 = new Student(999, "Μαρία", "Αναστασιάδου", 21, 'Θ', 6.1, 2);
//        Student st10 = new Student(101010, "Νικόλαος", "Γεωργίου", 20, 'Α', 7.7, 0);
//        Student st11 = new Student(111111, "Φοίβος", "Δελιβοριάς", 22, 'Α', 6, 1);
//        Student st12 = new Student(121212, "Απόστολος", "Ρίζος", 18, 'Α', 4.1, 3);
        ArrayStackInterface studentsStack = new ArrayStackInterface(3);
        System.out.println("***** Maximum Stack size is: " + studentsStack.getMaxStackCapacity());

        System.out.println("0) Current Stack size is: " + studentsStack.getStackSize());

        System.out.println("\n1) Pushing a new element in Stack.");
        studentsStack.pushStackElement(st1);
        System.out.println("1) Current Stack size is: " + studentsStack.getStackSize());

        System.out.println("\n2) Pushing a new element in Stack.");
        studentsStack.pushStackElement(st2);
        System.out.println("2) Current Stack size is: " + studentsStack.getStackSize());

        System.out.println("\n3) Pushing a new element in Stack.");
        studentsStack.pushStackElement(st3);
        System.out.println("3) Current Stack size is: " + studentsStack.getStackSize());

        System.out.println("\n4) Popping element from Stack.");
        studentsStack.showAllStackElements();
        tmpStud = studentsStack.popStackElement();
        System.out.println("4) Student with AM: " + tmpStud.getAM() + " was removed from the Stack.");
        System.out.println("4) Current Stack size is: " + studentsStack.getStackSize());

        System.out.println("\n5) Pushing a new element in Stack.");
        studentsStack.pushStackElement(st4);
        System.out.println("5) Current Stack size is: " + studentsStack.getStackSize());
        studentsStack.showAllStackElements();

        tmpStud = studentsStack.popStackElement();
        System.out.println("\n6) Student with AM: " + tmpStud.getAM() + " was removed from the Stack.");
        studentsStack.showAllStackElements();

        tmpStud = studentsStack.popStackElement();
        System.out.println("\n7) Student with AM: " + tmpStud.getAM() + " was removed from the Stack.");
        studentsStack.showAllStackElements();

        tmpStud = studentsStack.popStackElement();
        System.out.println("\n8) Student with AM: " + tmpStud.getAM() + " was removed from the Stack.");
        studentsStack.showAllStackElements();

//        System.out.println("\n9) Popping element from stack.");
//        st1 = studentsStack.popStackElement();
//        System.out.println("9) Current stack size is: " + studentsStack.getStackSize());
    }
}

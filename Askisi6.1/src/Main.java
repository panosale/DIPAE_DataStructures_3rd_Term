// ΑΣΚΗΣΗ 6.1
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!\nHeap Data Structure tests");
//        Student matrix1[] = {
//                new Student(17040, "Πάνος", "Αλευρόπουλος", 47, 'Α', 5, 2),
//                new Student(17065, "Νικολέτα", "Νικολάου", 27, 'Θ', 6, 1),
//                new Student(17025, "Γεώργιος", "Βασιλειάδης", 19, 'Α', 3, 3),
//                new Student(17050, "Ελένη", "Παπαδοπούλου", 20, 'Θ', 4.5, 2),
//                new Student(17020, "Μαρία", "Γεωργιάδου", 21, 'Θ', 6.4, 0),
//                new Student(17010, "Λουκάς", "Λουκίδης", 23, 'Α', 7, 1),
//                new Student(17015, "Κωνσταντίνος", "Αργυρός", 20, 'Α', 6.2, 0),
//                new Student(17055, "Αλεξάνδρα", "Παπανίκα", 19, 'Θ', 3.1, 1),
//                new Student(17045, "Μαρία", "Αναστασιάδου", 21, 'Θ', 6.1, 2),
//                new Student(17005, "Νικόλαος", "Γεωργίου", 20, 'Α', 7.7, 0),
//        };
//        for (int i = 0; i < matrix1.length; i++)
//            myHeap.insertElement(matrix1[i]);
        String matrix[] = {
                "Πάνος", "Νικολέτα", "Γεώργιος", "Ελένη", "Μαρία", "Λουκάς", "Κωνσταντίνος",
                "Αλεξάνδρα", "Γεωργία", "Νικόλαος", "Φοίβος", "Απόστολος"
        };
        Heap myHeap = new Heap(matrix.length);
        System.out.println("Heap is empty: " + myHeap.isEmpty());
        System.out.println("Heap is full: " + myHeap.isFull());
        System.out.println("Heap size: " + myHeap.size());
//        System.out.println("Trying to remove an element from the Heap.");
//        myHeap.remove(); // Εμφανίζει σφάλμα
        for (int i = 0; i < matrix.length; i++)
            myHeap.insert(matrix[i]);
        System.out.println("New data have been inserted in Heap.");
        System.out.println("Heap is empty: " + myHeap.isEmpty());
        System.out.println("Heap is full: " + myHeap.isFull());
        System.out.println("Heap size: " + myHeap.size());
        Object[] sortedMatrix = new Object[matrix.length];
//        System.out.println(sortedMatrix.length + " - " + matrix.length);
        sortedMatrix = myHeap.heapSort();
        System.out.println("Show sorted Heap array.");
        for (int i = 0; i < matrix.length; i++)
            System.out.println(sortedMatrix[i].toString());
        System.out.println();
//        myHeap.insert("HELLO");  // Εμφανίζει σφάλμα
        System.out.println("Heap is empty: " + myHeap.isEmpty());
        System.out.println("Heap is full: " + myHeap.isFull());
        System.out.println("Heap size: " + myHeap.size());
//        ΤΟ ΠΑΡΑΚΑΤΩ ΕΜΦΑΜΙΖΕΙ ΣΦΑΛΜΑ ΕΠΕΙΔΗ Ο ΣΩΡΟΣ ΕΙΝΑΙ ΗΔΗ ΚΕΝΟΣ
//        System.out.println("Now we are emptying Heap.");
//        for (int i = 0; i < matrix.length; i++) {
//            System.out.println(i);
//            System.out.println(myHeap.remove());
//        }
    }
}
// ΑΣΚΗΣΗ 3.4
public class Main {
    public static void main(String[] args) {
        // Τα παρακάτω είναι από την Άσκηση 3.4
        StudentsLinkedList studentsList = new StudentsLinkedList();
        studentsList = ListManagement.manageList(studentsList);
/*
        StudentsLinkedList studentsList = new StudentsLinkedList();
        System.out.println("List size: " + studentsList.getSize());
        studentsList.insertLast(new Student(2022005, "Panos", "Alevropoulos", 47, 'Α', 5, 2));
        studentsList.insertLast(new Student(222, "Νικολετα", "Νικολάου", 27, 'Θ', 6.4, 1));
        studentsList.insertLast(new Student(333, "Γεώργιος", "Βασιλειάδης", 19, 'Α', 3.3, 3));
        studentsList.insertLast(new Student(444, "Ελένη", "Παπαδοπούλου", 20, 'Θ', 4.5, 2));
        studentsList.insertFirst(new Student(888, "Αλεξάνδρα", "Παπανίκα", 19, 'Θ', 3.1, 1));
        System.out.println("List size: " + studentsList.getSize());
        System.out.println("Full list: ");
        studentsList.printList();
        int node2Find1 = 2022005;
        int node2Find2 = 7657;
        System.out.println();
        System.out.println(node2Find1 + " exists: " + studentsList.nodeExist(node2Find1));
        System.out.println(node2Find2 + " exists: " + studentsList.nodeExist(node2Find2));
        System.out.println();
        System.out.println("List max: " + studentsList.maxOfList());
        System.out.println();
        System.out.println("List min: " + studentsList.minOfList());
        System.out.println();
        Object[] tmp;
        tmp = studentsList.minMaxGradeOfList();
        System.out.println("List min---: " + tmp[0]  + "\n...by using function: minMaxGradeOfList(),\nList max...: " + tmp[1] + "\n...by using function: minMaxGradeOfList().");
*/
        // Τα παρακάτω είναι από την Άσκηση 3.2
/*
        LinkedList L1 = new LinkedList();
        System.out.println(L1.getSize());
        L1.insertLast("4 Antonis");
        L1.insertLast("1 Panagiotis");
        L1.insertLast("3 Manolis");
        L1.insertLast("5 Odysseas");
        L1.insertLast("2 Giorgos");
        String node2Find1 = "3 Manolis";
        String node2Find2 = "6 Stergios";
        try {
            System.out.println("List size: " + L1.getSize());
            System.out.println("List max: " + L1.maxOfList());
            System.out.println();
            Object[] tmp;
            tmp = L1.minMaxOfList();
            System.out.println("List min: " + tmp[0]  + " by using function: minMaxOfList(),\nList max: " + tmp[1] + " by using function: minMaxOfList().");
            System.out.println();
            System.out.println(node2Find1 + " exists: " + L1.nodeExist(node2Find1));
            System.out.println(node2Find2 + " exists: " + L1.nodeExist(node2Find2));
            System.out.println();
            System.out.println("Full list: ");
            L1.printList();
            System.out.println("Sorted full list: ");
            L1 =  L1.bubbleSort(); // ΔΕΝ ΧΡΕΙΑΖΕΤΑΙ ΝΑ ΕΠΙΣΤΡΕΦΕΙ ΤΗΝ ΤΙΜΗ
            L1.printList();
        }
        catch (ListEmptyException Error) {
            System.out.println("Exception: List is empty");
        }
*/
    }
}
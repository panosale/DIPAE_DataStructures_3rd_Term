// ΑΣΚΗΣΗ 3.3
public class Main {
    public static void main(String[] args) {
//        ListSort L1 = new ListSort();
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
            System.out.println(node2Find1 + " exists: " + L1.nodeExist(node2Find1));
            System.out.println(node2Find2 + " exists: " + L1.nodeExist(node2Find2));
            System.out.println();
            System.out.println("Full list: ");
            L1.printList();
            System.out.println("Sorted full list: ");
            L1 =  L1.sortList(); // ΔΕΝ ΧΡΕΙΑΖΕΤΑΙ ΝΑ ΕΠΙΣΤΡΕΦΕΙ ΤΗΝ ΤΙΜΗ
            L1.printList();
        }
        catch (ListEmptyException Error) {
            System.out.println("Exception: List is empty");
        }
    }
}
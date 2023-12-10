// ΔΟΚΙΜΗ ΤΗΣ ΛΙΣΤΑΣ
public class Main {
    public static void main(String[] args) {
        LinkedList L1 = new LinkedList();

        L1.insertLast("Panagiotis");
        L1.insertLast("Giorgos");
        L1.insertLast("Manolis");
        L1.insertLast("Antonis");
        L1.insertLast("Odysseas");
        String node2Find1 = "Manolis";
        String node2Find2 = "Stergios";
        try {
            System.out.println("List size: " + L1.getSize());
            System.out.println("List max: " + L1.maxOfList());
            System.out.println();
            System.out.println(node2Find1 + " exists: " + L1.nodeExist(node2Find1));
            System.out.println(node2Find2 + " exists: " + L1.nodeExist(node2Find2));
            System.out.println();
            System.out.println("Full list: ");
            L1.printList();
            System.out.println();
            L1.sortList();
            System.out.println("Sorted list: ");
            L1.printList();
        }
        catch (ListEmptyException Error) {
            System.out.println("Exception: List is empty");
        }
    }
}

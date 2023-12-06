// ΔΟΚΙΜΗ ΤΗΣ ΛΙΣΤΑΣ
public class Main {
    public static void main(String[] args) {
        LinkedList L1 = new LinkedList();

        L1.insertLast("Panagiotis");
        L1.insertLast("Giorgos");
        L1.insertLast("Manolis");
        L1.insertLast("Antonis");
        L1.insertLast("Odysseas");

        try {
            System.out.println("List size: " + L1.getSize());
            System.out.println("List max: " + L1.maxOfList());
            System.out.println();
            System.out.println("Full list: ");
            L1.printList();
        }
        catch (ListEmptyException Error) {
            System.out.println("Exception: List is empty");
        }
    }
}

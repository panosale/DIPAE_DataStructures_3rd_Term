// ΑΣΚΗΣΗ 3.3
public class Main {
    public static void main(String[] args) {
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
    }
}
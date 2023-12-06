// ΑΣΚΗΣΗ 3.2
public class Main {
    public static void main(String[] args) {
        LinkedList L1 = new LinkedList();

        L1.insertLast("1 Panagiotis");
        L1.insertLast("2 Giorgos");
        L1.insertLast("3 Manolis");
        L1.insertLast("4 Antonis");
        L1.insertLast("5 Odysseas");
        String node2Find = "4 Antonis";
        try {
            System.out.println("List size: " + L1.getSize());
            System.out.println("List max: " + L1.maxOfList());
            System.out.println("Node " + node2Find + " exists: " + L1.nodeExist(node2Find));
            System.out.println();
            System.out.println("Full list: ");
            L1.printList();
        }
        catch (ListEmptyException Error) {
            System.out.println("Exception: List is empty");
        }
    }
}
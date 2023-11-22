public class LinkedList {
    // Υλοποίηση μιας απλά Συνδεδεμένης Λίστας (linked list)
    private static final String MSG_LIST_EMPTY = "Η λίστα είναι κενή!"; // Δήλωση σταθεράς μηνύματος κενής λίστας
    private Node firstNode, lastNode;
    public LinkedList() { // Default constructor
        firstNode = lastNode = null;
    }
    public Node getFirstNode() {
        return this.firstNode;
    }
    public Node getLastNode() {
        return this.lastNode;
    }
    public boolean isEmpty() {
        return (this.firstNode == null);
    }
    public void insertFirst(Object newItem) {
        if (this.isEmpty())
            this.firstNode = this.lastNode = new Node(newItem, null);
        else
            this.firstNode = new Node(newItem, firstNode);
    }
    public void insertLas(Object newItem) {
        if (this.isEmpty())
            this.firstNode = this.lastNode = new Node(newItem, null);
        else
            this.lastNode = this.lastNode.next = new Node(newItem, firstNode);
    }
    public Object removeFirst() throws ListEmptyException {
        if (this.isEmpty())
            throw new ListEmptyException(MSG_LIST_EMPTY);
        Object removeItem = this.firstNode.item;
        if (this.firstNode == this.lastNode) // Μπορεί να χρησιμοποιηθεί .equals??
            this.firstNode = this.lastNode = null;
        else
            this.firstNode = this.firstNode.next;
        return removeItem;
    }
    public void printList() {
        if (this.isEmpty())
            System.out.println(MSG_LIST_EMPTY); // Γιατί όχι το? -> throw new ListEmptyException(MSG_LIST_EMPTY);
        else {
            Node currentNode = this.firstNode;
            while (currentNode != null) {
                System.out.println(currentNode.item.toString() + " ");
                currentNode = currentNode.next;
            }
            System.out.println("\n");
        }
    }
}

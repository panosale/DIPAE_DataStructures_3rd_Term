public class LinkedList implements List {
    // Υλοποίηση μιας απλά Συνδεδεμένης Λίστας (linked list)
    private static final String MSG_LIST_EMPTY = "Η λίστα είναι κενή!"; // Δήλωση σταθεράς μηνύματος κενής λίστας
    private Node firstNode, lastNode;
    public LinkedList() { // Default constructor
        this.firstNode = this.lastNode = null;
    }
    public Node getFirstNode() {
        return this.firstNode;
    }
    public Node getLastNode() {
        return this.lastNode;
    }
    public boolean isEmpty() {
        return (this.firstNode == null); // Επιστρέφει true (η λίστα είναι κενή) αν ο πρώτος κόμβος είναι null
    }
    @Override
    public int getSize() { // Να ελεγχθεί αν είναι σωστή
        int listSize = 0;
        if (this.isEmpty())
            System.out.println(MSG_LIST_EMPTY); // Γιατί όχι το? -> throw new ListEmptyException(MSG_LIST_EMPTY);
        else {
            Node currentNode = this.firstNode;
            while (currentNode != null)
                listSize++;
        }
        return listSize;
    }
    public void insertFirst(Object newItem) {
        if (this.isEmpty())
            this.firstNode = this.lastNode = new Node(newItem, null);
        else
            this.firstNode = new Node(newItem, this.firstNode);
    }
    public void insertLast(Object newItem) {
        if (this.isEmpty())
            this.firstNode = this.lastNode = new Node(newItem, null);
        else
            this.lastNode = this.lastNode.next = new Node(newItem, null);
    }
    public Object removeFirst() throws ListEmptyException {
        if (this.isEmpty())
            throw new ListEmptyException(MSG_LIST_EMPTY);
        Object removeItem = this.firstNode.item;
        if (this.firstNode == this.lastNode)
//        if (this.firstNode.equals(this.lastNode)) // Με την .equals. Για δοκιμή
            this.firstNode = this.lastNode = null;
        else
            this.firstNode = this.firstNode.next;
        return removeItem;
    }
    public Object removeLast() throws ListEmptyException {
        if (this.isEmpty())
            throw new ListEmptyException(MSG_LIST_EMPTY);
        Object removeItem = this.lastNode.item;
        if (this.firstNode == lastNode)
//        if (this.firstNode.equals(this.lastNode)) // Με την .equals. Για δοκιμή
            this.firstNode = this.lastNode = null;
        else {
            Node currentNode = this.firstNode;
            while (currentNode.next != this.lastNode)
                currentNode = currentNode.next;
            this.lastNode = currentNode;
            currentNode.next = null;
        }
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

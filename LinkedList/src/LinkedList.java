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
        // Υλοποίηση με while - ΑΡΧΗ
        if (this.isEmpty())
            System.out.println(MSG_LIST_EMPTY); // Γιατί όχι το? -> throw new ListEmptyException(MSG_LIST_EMPTY);
        else {
            Node position = this.firstNode;
            while (position != null) {
                position = position.getNext();
                listSize++;
            }
        }
        // Υλοποίηση με while - ΤΕΛΟΣ
        // Υλοποίηση με for - ΑΡΧΗ
/*
        for (Node position = this.firstNode; position != null; position = position.getNext())
            listSize++;
*/
        // Υλοποίηση με for - ΤΕΛΟΣ
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
        Object removedItem = this.firstNode.item;
        if (this.firstNode == this.lastNode)
//        if (this.firstNode.equals(this.lastNode)) // Με την .equals. Για δοκιμή
            this.firstNode = this.lastNode = null;
        else
            this.firstNode = this.firstNode.next;
        return removedItem;
    }
    public Object removeLast() throws ListEmptyException {
        if (this.isEmpty())
            throw new ListEmptyException(MSG_LIST_EMPTY);
        Object removedItem = this.lastNode.item;
        if (this.firstNode == this.lastNode)
//        if (this.firstNode.equals(this.lastNode)) // Με την .equals. Για δοκιμή
            this.firstNode = this.lastNode = null;
        else {
            // Υλοποίηση με while - ΑΡΧΗ
            Node currentNode = this.firstNode;
            while (currentNode.next != this.lastNode)
                currentNode = currentNode.next;
            // Υλοποίηση με while - ΤΕΛΟΣ
            // Υλοποίηση με for - ΑΡΧΗ
/*
            Node position;
            for (position = this.firstNode; position.getNext() != this.lastNode;
                 position = position.getNext()) {
                this.lastNode = position;
                position.setNext(null);
            }
*/
            // Υλοποίηση με for - ΤΕΛΟΣ
            this.lastNode = currentNode;
            currentNode.next = null;
        }
        return removedItem;
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
    // ΖΗΤΟΥΜΕΝΑ ΑΣΚΗΣΗΣ 3.2
    public Object maxOfList() {
        if (this.isEmpty())
            throw new ListEmptyException(MSG_LIST_EMPTY);
        Object max = this.firstNode.getItem();
        Node position = this.firstNode.getNext();
        while (position != null) {
            Comparable CompMax = (Comparable)max;
            Comparable CompItem = (Comparable)position.getItem();
            if (CompMax.compareTo(CompItem) < 0)
                max = position.getItem();
            // Εναλλακτικά μέσα στην if - ΑΡΧΗ
/*
            if (((Comparable)max).compareTo((Comparable)position.getItem()) < 0)
                max = position.getItem();
*/
            // Εναλλακτικά μέσα στην if - ΤΕΛΟΣ
            position = position.getNext();
        }
        return max;
    }
    public boolean nodeExist(Object item) {
        if (this.isEmpty())
            throw new ListEmptyException(MSG_LIST_EMPTY);
        boolean found = false;
        Node tmpNode = this.firstNode.getNext();
        while (tmpNode != null && !found)
            if (((Comparable)tmpNode).compareTo((Comparable)item) == 0)
                found = true;
            else
                tmpNode = tmpNode.getNext();
        return found;
    }
}

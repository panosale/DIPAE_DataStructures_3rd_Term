public class Node {
    // Ορισμός κόμβου μιας απλά Συνδεδεμένης Λίστας
    Object item;
    Node next;
    public Node() { // Default constructor
        this(null, null);
    }
    public Node(Object newItem, Node newNode) { // Full constructor
        this.item = newItem;
        this.next = newNode;
    }
    // Setters - Getters
    public void setItem(Object newItem) {
        this.item = newItem;
    }
    public Object getItem() {
        return this.item;
    }
    public void setNext(Node newNext) {
        this.next = newNext;
    }
    public Node getNext() {
        return this.next;
    }
}

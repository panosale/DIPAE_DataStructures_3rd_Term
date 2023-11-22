public class Node {
    // Ορισμός κόμβου μιας απλά Συνδεδεμένης Λίστας (Linked List)
    Object item;
    Node nextNode;
    public Node() {
        // Default constructor
        this(null, null);
    }
    public Node(Object newItem, Node newNode) {
        // Full constructor
        this.item = newItem;
        this.nextNode = newNode;
    }
    // Setters - Getters
    public void setItem(Object item) {
        this.item = item;
    }
    public Object getItem() {
        return item;
    }
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
    public Node getNextNode() {
        return nextNode;
    }
}

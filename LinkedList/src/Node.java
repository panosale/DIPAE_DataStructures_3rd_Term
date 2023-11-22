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
    
}

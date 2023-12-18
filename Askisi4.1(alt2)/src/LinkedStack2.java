//import Node;
public class LinkedStack2  implements Stack {
    // ΥΛΟΠΟΙΗΣΗ ΣΤΟΙΒΑΣ (Stack) ΜΟΝΟ ΜΕ ΤΗ ΧΡΗΣΗ ΤΗΣ ΚΛΑΣΗΣ Node
    private Node topNode;
    private int size;
    public LinkedStack2() { // Default constructor
        topNode = null;
        size = 0;
    } // End of: Default constructor
    public boolean stackIsEmpty() {
        return (topNode == null);
    } // End of function: stackIsEmpty()
    public int getStackSize() {
        // Επιστρέφει το μέγεθος της Συνδεδεμένης Στοίβας
        return this.size;
    } // End of function: getStackSize()
    public Object topStackElement() throws StackEmptyException {
        // Επιστρέφει το στοιχείο που βρίσκεται στην κορυφή της Συνδεδεμένης Στοίβας
        if (this.stackIsEmpty())
            throw new StackEmptyException(MSG_STACK_EMPTY);
        return topNode.getItem();
    } // End of function: topStackElement()
    public void pushStackElement(Object item) throws StackFullException {
        // Εισάγει ένα νέο στοιχείο στην κορυφή της Συνδεδεμένης Στοίβας
        Node newTop = new Node();
        newTop.setItem(item);
        newTop.setNext(topNode);
        topNode = newTop;
        size++;
    } // End of function: pushStackElement()
    public Object popStackElement() throws StackEmptyException {
        // Εξάγει και επιστρέφει το στοιχείο που βρίσκεται στην κορυφή της Συνδεδεμένης Στοίβας
        try {
            Object temp = topNode.getItem();
            topNode = topNode.getNext();
            size--;
            return temp;
        }
        catch (NullPointerException str) {
            throw new StackEmptyException((MSG_STACK_EMPTY));
        }
    } // End of function: popStackElement()
}

public class LinkedStack3 extends LinkedList implements Stack {
    // ΥΛΟΠΟΙΗΣΗ ΣΤΟΙΒΑΣ ΜΕ ΤΗ ΜΕΘΟΔΟ ΤΗΣ ΚΛΗΡΟΝΟΜΙΚΟΤΗΤΑΣ ΤΗΣ ΚΛΑΣΗΣ LinkedList
    public LinkedStack3() { // Default constructor
        super();
    } // End of: Default constructor
    public boolean stackIsEmpty() {
        return super.isEmpty();
    } // End of function: stackIsEmpty()
    public int getStackSize() {
        // Επιστρέφει το μέγεθος της Συνδεδεμένης Στοίβας
        return super.getSize();
    } // End of function: getStackSize()
    public Object topStackElement() throws StackEmptyException {
        // Επιστρέφει το στοιχείο που βρίσκεται στην κορυφή της Συνδεδεμένης Στοίβας
        if (this.stackIsEmpty())
            throw new StackEmptyException(MSG_STACK_EMPTY);
        Object temp;
        temp = this.removeFirst();
        this.insertFirst(temp);
        return temp;
    } // End of function: topStackElement()
    public void pushStackElement(Object item) throws StackEmptyException {
        // Εισάγει ένα νέο στοιχείο στην κορυφή της Συνδεδεμένης Στοίβας
        this.insertFirst(item);
    } // End of function: pushStackElement()
    public Object popStackElement() throws StackEmptyException {
        // Εξάγει και επιστρέφει το στοιχείο που βρίσκεται στην κορυφή της Συνδεδεμένης Στοίβας
        try {
            return this.removeFirst(); // <-------------- Ίσως, είναι λάθος αυτό
        }
        catch (ListEmptyException str) {
            throw new StackEmptyException((MSG_STACK_EMPTY));
        }
    } // End of function: popStackElement()

}

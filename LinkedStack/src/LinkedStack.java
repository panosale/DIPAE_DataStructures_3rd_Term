public class LinkedStack implements Stack {
    // ΥΛΟΠΟΙΗΣΗ ΣΤΟΙΒΑΣ (Stack) ΜΕ ΣΥΝΘΕΣΗ (COMPOSITION)
    // Η ΤΕΧΝΙΚΗ ΑΥΤΗ ΟΝΟΜΑΖΕΤΑΙ ΚΑΙ ΕΞΟΥΣΙΟΔΟΤΗΣΗ (Delegation)
    private LinkedList S;
    public LinkedStack() { // Default constructor
        S = new LinkedList();
    } // End of: Default constructor
    public boolean stackIsEmpty() {
        // Επιστρέφει true αν η Συνδεδεμένη Στοίβα είναι κενή
        return S.isEmpty(); // Επιστρέφει true (η λίστα είναι κενή) αν ο πρώτος κόμβος είναι null
    } // End of function: isEmpty()
    public int getStackSize() {
        // Επιστρέφει το μέγεθος της Συνδεδεμένης Στοίβας
        return S.getSize();
    } // End of function: getSize()
    public Object topStackElement() throws StackEmptyException {
        // Επιστρέφει το στοιχείο που βρίσκεται στην κορυφή της Συνδεδεμένης Στοίβας
        if (S.isEmpty())
            throw new StackEmptyException((MSG_STACK_EMPTY));
        Object temp = S.removeFirst();
        S.insertFirst(temp);
        return temp;
    } // End of function: topStackElement()
    public void pushStackElement(Object item) throws StackFullException {
        // Εισάγει ένα νέο στοιχείο στην κορυφή της Συνδεδεμένης Στοίβας
        S.insertFirst(item);
    } // End of function: pushStackElement()
    public Object popStackElement() throws StackEmptyException {
        try {
            return S.removeFirst();
        }
        catch (ListEmptyException str) {
            throw new StackEmptyException(MSG_STACK_EMPTY);
        }
    } // End of function: popStackElement()
}

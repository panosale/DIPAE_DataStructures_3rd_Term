public interface Stack {
    public static final String MSG_STACK_FULL = "Υπερχείλιση στοίβας. Η στοίβα είναι πλήρης."; // Δήλωση σταθεράς μηνύματος πλήρους Συνδεδεμένης Στοίβας
    public static final String MSG_STACK_EMPTY = "Η στοίβα είναι κενή."; // Δήλωση σταθεράς μηνύματος κενής Συνδεδεμένης Στοίβας
    public static final int MAX_CAPACITY = 100; // Δήλωση σταθεράς μέγιστου μεγέθους Συνδεδεμένης Στοίβας
    public boolean stackIsEmpty(); // Επιστρέφει true αν η Συνδεδεμένη Στοίβα είναι κενή
    public int getStackSize(); // Επιστρέφει το μέγεθος της Συνδεδεμένης Στοίβας
    public Object topStackElement() throws StackEmptyException; // Επιστρέφει το στοιχείο που βρίσκεται στην κορυφή της Συνδεδεμένης Στοίβας
    public void pushStackElement(Object item) throws StackFullException; // Εισάγει ένα νέο στοιχείο στην κορυφή της Συνδεδεμένης Στοίβας
    public Object popStackElement() throws StackEmptyException; // Εξάγει και επιστρέφει το στοιχείο που βρίσκεται στην κορυφή της Συνδεδεμένης Στοίβας
}

public interface Stack {
    public static final String MSG_STACK_FULL = "Υπερχείλιση στοίβας. Η στοίβα είναι πλήρης."; // Δήλωση σταθεράς μηνύματος πλήρους στοίβας
    public static final String MSG_STACK_EMPTY = "Η στοίβα είναι κενή."; // Δήλωση σταθεράς μηνύματος κενής στοίβας
    public static final int MAX_STACK_SIZE = 100; // Δήλωση σταθεράς μέγιστου μεγέθους στοίβας
    public int size(); // Επιστρέφει το μέγεθος της Στοίβας
    public boolean isEmpty(); // Επιστρέφει true αν η Στοίβα είναι κενή
    public Object top() throws StackEmptyException; // Επιστρέφει το στοιχείο που βρίσκεται στην κορυφή της Στοίβας
    public void push(Object item) throws StackFullException; // Εισάγει ένα νέο στοιχείο στην κορυφή της Στοίβας
    public Object pop() throws StackEmptyException; // Εξάγει και επιστρέφει το στοιχείο που βρίσκεται στην κορυφή της Στοίβας
}

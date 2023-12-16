public interface Queue {
    public static final String MSG_QUEUE_FULL = "Υπερχείλιση ουράς. Η ουρά είναι πλήρης."; // Δήλωση σταθεράς μηνύματος πλήρους ουράς
    public static final String MSG_QUEUE_EMPTY = "Η ουρά είναι κενή."; // Δήλωση σταθεράς μηνύματος κενής ουράς
    public static final int MAX_CAPACITY = 1000; // Δήλωση σταθεράς μέγιστου μεγέθους ουράς
    public boolean queueIsEmpty(); // Επιστρέφει true αν η Ουρά είναι κενή
    public int getQueueSize(); // Επιστρέφει το μέγεθος της Ουράς
    public Object frontQueueElement() throws QueueEmptyException; // Επιστρέφει το στοιχείο που βρίσκεται στο μπροστά μέρος της Συνδεδεμένης Ουράς
    public void enqueueElement(Object item) throws QueueFullException; // Εισάγει ένα νέο στοιχείο στο πίσω μέρος της Συνδεδεμένης Ουράς
    public Object dequeueElement() throws QueueEmptyException; // Εξάγει και επιστρέφει το στοιχείο που βρίσκεται στο εμπρός μέρος της Συνδεδεμένης Ουράς
}

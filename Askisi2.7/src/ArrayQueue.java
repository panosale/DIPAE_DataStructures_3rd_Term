public class ArrayQueue implements Queue{
    private static final String MSG_QUEUE_FULL = "Υπερχείλιση ουράς. Η ουρά είναι πλήρης."; // Δήλωση σταθεράς μηνύματος πλήρους ουράς
    private static final String MSG_QUEUE_EMPTY = "Η ουρά είναι κενή."; // Δήλωση σταθεράς μηνύματος κενής ουράς
    public static final int MAX_CAPACITY = 1000; // Δήλωση σταθεράς μέγιστου μεγέθους ουράς
    private int queueCapacity;
    private Object[] Q;
    private int firstElement = 0;
    private int lastElement = 0;
    public ArrayQueue() {
        this(MAX_CAPACITY);
    }
    // Full constructor
    public ArrayQueue(int newCapacity) {
        this.queueCapacity = newCapacity;
        Q = new Object[this.queueCapacity];
    }
    public int getQueueSize() {
        // Επιστρέφει το μέγεθος της Ουράς
        return (this.lastElement - this.firstElement);
    }
    public int getMaxQueueCapacity() {
        return this.queueCapacity;
    }
    public boolean queueIsEmpty() {
        // Επιστρέφει true αν η Ουρά είναι κενή
        return (this.firstElement == this.lastElement);
    }
    public Object frontQueueElement() throws QueueEmptyException {
        // Επιστρέφει το στοιχείο που βρίσκεται στο μπροστά μέρος της Ουράς
        if (this.queueIsEmpty())
            throw new QueueEmptyException(MSG_QUEUE_EMPTY);
        return this.Q[this.firstElement];
    }
    public void enqueueElement(Object item) throws QueueFullException {
        // Εισάγει ένα νέο στοιχείο στο πίσω μέρος της Ουράς
        if (this.lastElement == this.queueCapacity) // Εικονική υπερχείλιση??
            throw new QueueFullException(MSG_QUEUE_FULL);
        this.Q[lastElement++] = item; // ΠΡΟΣΟΧΗ! Πρώτα αυξάνει το last και μετά εισάγει το στοιχείο (item) στον πίνακα
    }
    public Object dequeueElement() throws QueueEmptyException {
        // Εξάγει και επιστρέφει το στοιχείο που βρίσκεται στο εμπρός μέρος της Ουράς
        Object tmpElement;
        if (this.queueIsEmpty())
            throw new QueueEmptyException(MSG_QUEUE_EMPTY);
        tmpElement = this.Q[firstElement];
        this.Q[firstElement++] = null; // ΠΡΟΣΟΧΗ! Πρώτα θέτει null στη θέση του firstElement για τον garbage collector (εκκαθάριση της μνήμης από τα "σκουπίδια") και μετά το αυξάνει
        return tmpElement;
    }
}

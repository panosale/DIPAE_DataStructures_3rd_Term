public class LinkedQueue implements Queue {
    private LinkedList Q;
    public LinkedQueue() { // Default constructor
        Q = new LinkedList();
    } // End of: Default constructor
    public boolean queueIsEmpty() {
        // Επιστρέφει true αν η Ουρά είναι κενή
        return Q.isEmpty();
    } // End of function: queueIsEmpty()
    public int getQueueSize() {
        // Επιστρέφει το μέγεθος της Ουράς
        return Q.getSize();
    } // End of function: getQueueSize()
    public Object frontQueueElement() throws QueueEmptyException {
        // Επιστρέφει το στοιχείο που βρίσκεται στο μπροστά μέρος της Συνδεδεμένης Ουράς
        if (Q.isEmpty())
            throw new QueueEmptyException(MSG_QUEUE_EMPTY);
        Object temp = Q.removeFirst();
        Q.insertFirst(temp);
        return temp;
    } // End of function: frontQueueElement()
    public void enqueueElement(Object item) throws QueueFullException {
        // Εισάγει ένα νέο στοιχείο στο πίσω μέρος της Συνδεδεμένης Ουράς
        Q.insertLast(item);
    } // End of function: enqueueElement()
    public Object dequeueElement() throws QueueEmptyException {
        // Εξάγει και επιστρέφει το στοιχείο που βρίσκεται στο εμπρός μέρος της Συνδεδεμένης Ουράς
        try {
            return Q.removeFirst();
        }
        catch (ListEmptyException str) {
            throw new QueueEmptyException(MSG_QUEUE_EMPTY);
        }
    }
}

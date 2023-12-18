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
        // Ή διαφορετικά: public Item get() [ίδια με την public Object dequeueElement();]
        // Επιστρέφει το στοιχείο που βρίσκεται στο μπροστά μέρος της Συνδεδεμένης Ουράς
        if (Q.isEmpty())
            throw new QueueEmptyException(MSG_QUEUE_EMPTY);
        Object temp = Q.removeFirst();
        Q.insertFirst(temp);
        return temp;
    } // End of function: frontQueueElement()
    public void enqueueElement(Object item) throws QueueFullException {
        // Ή διαφορετικά: public void put(Item item)
        // Εισάγει ένα νέο στοιχείο στο τέλος της Συνδεδεμένης Ουράς
        Q.insertLast(item);
    } // End of function: enqueueElement()
    public Object dequeueElement() throws QueueEmptyException {
        // Ή διαφορετικά: public Item get()
        // Εξάγει και επιστρέφει το πρώτο στοιχείο της Συνδεδεμένης Ουράς
        try {
            return Q.removeFirst();
        }
        catch (ListEmptyException str) {
            throw new QueueEmptyException(MSG_QUEUE_EMPTY);
        }
    }
}

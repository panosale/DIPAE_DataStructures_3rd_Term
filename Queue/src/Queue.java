public interface Queue {
    public int getQueueSize(); // Επιστρέφει το μέγεθος της Ουράς
    public boolean queueIsEmpty(); // Επιστρέφει true αν η Ουρά είναι κενή
    public Object frontQueueElement() throws QueueEmptyException; // Επιστρέφει το στοιχείο που βρίσκεται στο μπροστά μέρος της Ουράς
    public void enqueueElement(Object item) throws QueueFullException; // Εισάγει ένα νέο στοιχείο στο πίσω μέρος της Ουράς
    public Object dequeueElement() throws QueueEmptyException; // Εξάγει και επιστρέφει το στοιχείο που βρίσκεται στο εμπρός μέρος της Ουράς
}

public interface Queue {
    public int size(); // Επιστρέφει το μέγεθος της Ουράς
    public boolean isEmpty(); // Επιστρέφει true αν η Ουρά είναι κενή
    public Object front() throws QueueEmptyException; // Επιστρέφει το στοιχείο που βρίσκεται στο μπροστά μέρος της Ουράς
    public void enqueue(Object item) throws QueueFullException; // Εισάγει ένα νέο στοιχείο στο πίσω μέρος της Ουράς
    public Object dequeue() throws QueueEmptyException; // Εξάγει και επιστρέφει το στοιχείο που βρίσκεται στο εμπρός μέρος της Ουράς
}

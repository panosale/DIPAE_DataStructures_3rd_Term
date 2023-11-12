public interface StackInterface {
    public int getStackSize(); // Επιστρέφει το μέγεθος της Στοίβας
    public boolean stackIsEmpty(); // Επιστρέφει true αν η Στοίβα είναι κενή
    public Object topStackElement() throws StackEmptyException; // Επιστρέφει το στοιχείο που βρίσκεται στην κορυφή της Στοίβας
    public void pushStackElement(Object item) throws StackFullException; // Εισάγει ένα νέο στοιχείο στην κορυφή της Στοίβας
    public Object popStackElement() throws StackEmptyException; // Εξάγει και επιστρέφει το στοιχείο που βρίσκεται στην κορυφή της Στοίβας
    public void showAllStackElements();
}

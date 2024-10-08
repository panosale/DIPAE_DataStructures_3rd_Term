public class ArrayStack implements Stack{
    private int stackCapacity;
    private Object[] S;
    private int top = -1;
    // Default constructor
    public ArrayStack() {
        this(MAX_STACK_SIZE);
    }
    // Full constructor
    public ArrayStack(int newCapacity) {
        this.stackCapacity = newCapacity;
        this.S = new Object[this.stackCapacity];
    }
    public int size() {
        // Επιστρέφει το μέγεθος της Στοίβας
        return (this.top + 1);
    }
    public int getMaxStackCapacity() {
        // Επιστρέφει το μέγεθος της Στοίβας
        return this.stackCapacity;
    }
    public boolean isEmpty() {
        // Επιστρέφει true αν η Στοίβα είναι κενή
        return (this.top < 0);
    }
    public Object top() throws StackEmptyException {
        // Επιστρέφει το στοιχείο που βρίσκεται στην κορυφή της Στοίβας
        if (this.isEmpty())
            throw new StackEmptyException(MSG_STACK_EMPTY);
        return this.S[this.top];
    }
    public void push(Object item) throws StackFullException {
        // Εισάγει ένα νέο στοιχείο στην κορυφή της Στοίβας
        //if (this.getStackSize() == this.stackCapacity - 1) // Στις σημειώσεις έχει αυτή τη γραμμή αλλά δεν επιστρέφει σωστό μέγεθος της Στοίβας
        if (this.size() == this.stackCapacity) // Αυτή η γραμμή φαίνεται να επιστρέφει σωστό μέγεθος της Στοίβας
            throw new StackFullException(MSG_STACK_FULL);
//        System.out.println("*** Top before push: " + this.top); // FOR TESTS
        this.S[++this.top] = item; // ΠΡΟΣΟΧΗ! Πρώτα αυξάνει το top και μετά εισάγει το στοιχείο (item) στον πίνακα
//        System.out.println("*** Top after push: " + this.top); // FOR TESTS
    }
    public Object pop() throws StackEmptyException {
        // Εξάγει και επιστρέφει το στοιχείο που βρίσκεται στην κορυφή της Στοίβας
        Object tmpElement;
        if (this.isEmpty())
            throw new StackEmptyException(MSG_STACK_EMPTY);
        tmpElement = this.S[top];
//        System.out.println("*** Top before push: " + this.top); // FOR TESTS
        this.S[this.top--] = null; // ΠΡΟΣΟΧΗ! Πρώτα θέτει null στη θέση του top για τον garbage collector (εκκαθάριση της μνήμης από τα "σκουπίδια") και μετά το μειώνει
//        System.out.println("*** Top after push: " + this.top); // FOR TESTS
        return tmpElement;
    }
}

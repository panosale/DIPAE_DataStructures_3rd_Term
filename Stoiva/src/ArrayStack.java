import javax.swing.plaf.PanelUI;

public class ArrayStack implements Stack{
    public static final int MAX_CAPACITY = 100;
    private int stackCapacity;
    private Object[] S;
    private int top = -1;
    // Constructor
    public ArrayStack() {
        this(MAX_CAPACITY);
    }
    // Full comstructor
    public ArrayStack(int newCapacity) {
        this.stackCapacity = newCapacity;
        S = new Object[this.stackCapacity];
    }
    public int getStackSize() {
        // Επιστρέφει το μέγεθος της Στοίβας
        return 0; // TO CHANGE
    }
    public boolean stackIsEmpty() {
        // Επιστρέφει true αν η Στοίβα είναι κενή
        return false; // TO CHANGE
    }
    public Object topStackElement() throws StackEmptyException {
        // Επιστρέφει το στοιχείο που βρίσκεται στην κορυφή της Στοίβας
        Object tmp = new Object(); // TO CHANGE
        return tmp; // TO CHANGE
    }
    public void pushStackElement(Object item) throws StackFullException {
        // Εισάγει ένα νέο στοιχείο στην κορυφή της Στοίβας
    }
    public Object popStackElement() throws StackEmptyException {
        // Εξάγει και επιστρέφει το στοιχείο που βρίσκεται στην κορυφή της Στοίβας
        Object tmp = new Object(); // TO CHANGE
        return tmp; // TO CHANGE
    }

}

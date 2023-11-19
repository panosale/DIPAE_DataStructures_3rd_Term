public class ArrayStack implements StackInterface {
    private static final String MSG_STACK_FULL = "Υπερχείλιση στοίβας. Η στοίβα είναι πλήρης."; // Δήλωση σταθεράς μηνύματος πλήρους στοίβας
    private static final String MSG_STACK_EMPTY = "Η στοίβα είναι κενή."; // Δήλωση σταθεράς μηνύματος κενής στοίβας
    public static final int MAX_CAPACITY = 100; // Δήλωση σταθεράς μέγιστου μεγέθους στοίβας
    private int stackCapacity;
    private Object[] S;
    private int top = -1;
    // Default constructor
    public ArrayStack() {
        this(MAX_CAPACITY);
    }
    // Full constructor
    public ArrayStack(int newCapacity) {
        this.stackCapacity = newCapacity;
        this.S = new Object[this.stackCapacity];
    }
    public int getStackSize() {
        // Επιστρέφει το μέγεθος της Στοίβας
        return (this.top + 1);
    }
    public int getMaxStackCapacity() {
        // Επιστρέφει το μέγεθος της Στοίβας
        return this.stackCapacity;
    }
    public boolean stackIsEmpty() {
        // Επιστρέφει true αν η Στοίβα είναι κενή
        return (this.top < 0);
    }
    public Object topStackElement() throws StackEmptyException {
        // Επιστρέφει το στοιχείο που βρίσκεται στην κορυφή της Στοίβας
        if (this.stackIsEmpty())
            throw new StackEmptyException(MSG_STACK_EMPTY);
        return this.S[this.top];
    }
    public void pushStackElement(Object stud) throws StackFullException {
        // Εισάγει ένα νέο στοιχείο στην κορυφή της Στοίβας
        //if (this.getStackSize() == this.stackCapacity - 1) // Στις σημειώσεις έχει αυτή τη γραμμή αλλά δεν επιστρέφει σωστό μέγεθος της Στοίβας
        if (this.getStackSize() == this.stackCapacity) // Αυτή η γραμμή φαίνεται να επιστρέφει σωστό μέγεθος της Στοίβας
            throw new StackFullException(MSG_STACK_FULL);
        //System.out.println("*** Top before push: " + this.top); // FOR TESTS
        this.S[++this.top] = stud; // ΠΡΟΣΟΧΗ! Πρώτα αυξάνει το top και μετά εισάγει το στοιχείο (item) στον πίνακα
        //System.out.println("*** Top after push: " + this.top); // FOR TESTS
    }
    public Object popStackElement() throws StackEmptyException {
        // Εξάγει και επιστρέφει το στοιχείο που βρίσκεται στην κορυφή της Στοίβας
        Object tmpElement;
        if (this.stackIsEmpty())
            throw new StackEmptyException(MSG_STACK_EMPTY);
        tmpElement = this.S[top];
//        System.out.println("*** Top before push: " + this.top); // FOR TESTS
        this.S[this.top--] = null; // ΠΡΟΣΟΧΗ! Πρώτα θέτει null στη θέση του top για τον garbage collector (εκκαθάριση της μνήμης από τα "σκουπίδια") και μετά το μειώνει
//        System.out.println("*** Top after push: " + this.top); // FOR TESTS
        return tmpElement;
    }
    // Added by Panos
    public void showAllStackElements() { // ΝΑ ΔΙΝΩ ΣΑΝ ΠΑΡΑΜΑΕΤΡΟ ΤΗΝ ΚΛΑΣΗ ΠΟΥ ΘΕΛΩ, ΝΑ ΕΛΕΓΧΕΙ ΑΝ ΤΟ ΑΝΤΙΚΕΙΜΕΝΟ ΕΙΝΑΙ ΑΥΤΗΣ ΤΗΣ ΚΛΑΣΗΣ ΚΑΙ ΝΑ ΤΟ ΤΥΠΩΝΕΙ
        if (this.stackIsEmpty())
            System.out.println("Η Στοίβα είναι κενή.");
//        else {
////          ΓΙΑ ΕΜΦΑΝΙΣΗ ΣΥΜΦΩΝΑ ΜΕ ΤΗ ΘΕΩΡΗΤΙΚΗ ΔΙΑΤΑΞΗ ΤΗΣ ΣΤΟΙΒΑΣ (ΦΘΙΝΟΥΣΑ) ΟΛΩΝ ΤΩΝ ΣΤΟΙΧΕΙΩΝ ΤΗΣ ΣΤΟΙΒΑΣ ΕΝΕΡΓΟΠΟΙΟΥΜΕ ΤΑ ΠΑΡΑΚΑΤΩ
//            for (int i = this.top; i >= 0; i--)
//                System.out.println("Ονοματεπώνυμο: " + S[i].getLastName() + ", " + S[i].getFirstName() + ", ΑΜ: " + S[i].getAM());
//          Ή ΓΙΑ ΚΑΝΟΝΙΚΗ ΕΜΦΑΝΙΣΗ (ΑΥΞΟΥΣΑ ΣΥΜΦΩΝΑ ΜΕ ΤΗΝ ΠΡΑΓΜΑΤΙΚΗ ΘΕΣΗ) ΟΛΩΝ ΤΩΝ ΣΤΟΙΧΕΙΩΝ ΤΗΣ ΣΤΟΙΒΑΣ ΕΝΕΡΓΟΠΟΙΟΥΜΕ ΤΑ ΠΑΡΑΚΑΤΩ
//            for (int i = 0; i < this.top + 1; i++)
//                System.out.println("Ονοματεπώνυμο: " + S[i].getLastName() + ", " + S[i].getFirstName() + ", ΑΜ: " + S[i].getAM());
//        }
    } // Added by Panos
}

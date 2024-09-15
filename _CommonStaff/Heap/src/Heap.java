public class Heap {
    public static final String MSG_HEAP_FULL = "Ο σωρός είναι γεμάτος!"; // Δήλωση σταθεράς μηνύματος γεμάτου Σωρού
    public static final String MSG_HEAP_EMPTY = "Ο σωρός είναι κενός!"; // Δήλωση σταθεράς μηνύματος κενού Σωρού

    private Object[] btree;
    private int index;
    private int capacity;

    public Heap() {
        this(100);
    } // End of: Default constructor
    public Heap(int cap) {
        this.capacity = cap;
        this.btree = new Object[this.capacity + 1];
        this.index = 0;
    } // End of: Second constructor
    public int size() {
        return (this.index);
    } // End of: public size() function
    public boolean isEmpty() {
        return (this.index == 0);
    } // End of: public isEmpty() function
    public boolean isFull() {
        return (this.index == this.capacity);
    } // End of: public isFull() function
    public void insert(Object newItem) throws HeapFullException {
        if (this.isFull())
            throw new HeapFullException(MSG_HEAP_FULL);
        int father, son;
        son = ++this.index; // Πρώτα αποθηκεύεται στο son η παλιά τιμή του index και μετά αυξάνεται κατά 1 το index.
        this.btree[son] = newItem; // Το newItem τοποθετείτε αρχικά στην τελευταία θέση του Σωρού
        father = son / 2;
        while (son > 1 && ((Comparable)this.btree[son]).compareTo((Comparable)this.btree[father]) > 0) {
            // Επειδή είναι Σωρός Μεγίστων θα πρέπει κάθε τιμή στη θέση father να είναι μεγαλύτερη από την τιμή στη θέση son
            Object tmp = this.btree[father]; // Swap
            this.btree[father] = this.btree[son]; // Swap
            this.btree[son] = tmp; // Swap
            son = father;
            father = son / 2;
        }
    } // End of function: public insert()
    public Object remove() throws HeapEmptyException {
        if (this.isEmpty())
            throw new HeapEmptyException(MSG_HEAP_EMPTY);
        int father, son;
        Object lastItem = this.btree[index];
        this.btree[index] = this.btree[1];
        Object removeItem = this.btree[1];
        index--;
        father = 1;
        if (index > 2 && ((Comparable)this.btree[2]).compareTo((Comparable)this.btree[3]) > 0)
            son = 2;
        else
            son = 3;
        while (son <= index && ((Comparable)this.btree[son]).compareTo((Comparable)lastItem) > 0) {
            this.btree[father] = this.btree[son];
            father = son;
            son  = father / 2;
            if (son + 1 <= index && ((Comparable)this.btree[son + 1]).compareTo((Comparable)this.btree[son]) > 0)
                son++;
        }
        this.btree[father] = lastItem;
        return (removeItem);
    } // End of function: public remove()
    public Object[] heapSort() {
        int size = this.size();
        Object[] array = new Object[size];
        for (int i = size-1; i > 0; i--)
            array[i] = this.remove();
        return array;
    } // End of function: public heapSort()
}

import java.util.ArrayList;

public class HeapAL<E> implements HeapInterfaceTP<E> {

    private ArrayList<E> btree;
//    private int index;
//    private int capacity;

    public HeapAL() {
        btree = new ArrayList<E>();
        btree.add(null);
    } // End of: Default constructor
//    public HeapAL(int cap) {
//        this.capacity = cap;
//        this.btree = new ArrayList<E>();
//        this.index = 0;
//    } // End of: Second constructor
    public int size() {
        return (this.btree.size() - 1);
    } // End of: public size() function
    public boolean isEmpty() {
        return (this.btree.size() == 0);
    } // End of: public isEmpty() function
    public boolean isFull() { // Δεν χρειάζεται στην υλοποίηση με ArrayList. Την κρατάμε μόνο για συμβατότητα
        return (false);
    } // End of: public isFull() function
    public void insert(E newItem) throws HeapFullException {
        if (this.isFull())
            throw new HeapFullException(MSG_HEAP_FULL);
        btree.add(newItem);
        int son = this.size();
        int father = son / 2;
        while (son > 1 && ((Comparable)this.btree.get(son)).compareTo((Comparable)this.btree.get(father)) > 0) {
            // Επειδή είναι Σωρός Μεγίστων θα πρέπει κάθε τιμή στη θέση father να είναι μεγαλύτερη από την τιμή στη θέση son
            E tmp = this.btree.get(father); // Swap
            this.btree.set(father, this.btree.get(son)); // Swap
            this.btree.set(son, tmp); // Swap
            son = father;
            father = son / 2;
        }
    } // End of function: public insert()
    public E remove() throws HeapEmptyException {
        if (this.isEmpty())
            throw new HeapEmptyException(MSG_HEAP_EMPTY);
        E removeItem = this.btree.get(1);
//        if (this.size() == 1) {
//            this.btree.remove(this.size());
//            return removeItem;
//        }
        E lastItem = this.btree.remove(this.size());
        int son = 0;
        int father = 1;
//        this.btree[index] = this.btree[1];
//        index--;
//        father = 1;
        if ((this.size() > 2) && ((Comparable)this.btree.get(2)).compareTo((Comparable)this.btree.get(3)) > 0)
            son = 2;
        else
            son = 3;
        while (son < this.size() && ((Comparable)this.btree.get(son)).compareTo((Comparable)lastItem) > 0) {
            this.btree.set(father, this.btree.get(son));
            father = son;
            son  = father * 2;
            if (son + 1 <= this.size() && ((Comparable)this.btree.get(son + 1)).compareTo((Comparable)this.btree.get(son)) > 0)
                son++;
        }
        if (this.size() != 0)
            this.btree.set(father, lastItem);
        this.btree.set(father, lastItem);
        return (removeItem);
    } // End of function: public remove()
    // Ζητούμενο Άσκησης 6.2
    // Να ελεγχθεί αν μπορεί να επιστρέφει Γενικό τύπο <E>
    public Object[] heapSort() { // ΠΡΟΣΟΧΗ! Κατά την ταξινόμηση τα στοιχεία ΑΦΑΙΡΟΥΝΤΑΙ από τον Σωρό και προστίθενται σε πίνακα
        int size = this.size();
        Object[] array = new Object[size];
        for (int i = size-1; i >= 0; i--)
            array[i] = this.remove();
        return array;
    } // End of function: public heapSort()

}

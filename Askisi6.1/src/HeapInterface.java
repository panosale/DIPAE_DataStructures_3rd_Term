public interface HeapInterface {
    public static final String MSG_HEAP_FULL = "Ο σωρός είναι γεμάτος!"; // Δήλωση σταθεράς μηνύματος γεμάτου Σωρού
    public static final String MSG_HEAP_EMPTY = "Ο σωρός είναι κενός!"; // Δήλωση σταθεράς μηνύματος κενού Σωρού
    public int size();
    public boolean isEmpty();
    public boolean isFull();
    public void insert(Object newItem) throws HeapFullException;
    public Object remove() throws HeapEmptyException;
}

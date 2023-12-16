public interface List {
    public static final String MSG_LIST_EMPTY = "Η λίστα είναι κενή!"; // Δήλωση σταθεράς μηνύματος κενής λίστας
    public boolean isEmpty( );
    public int getSize();
    public void insertFirst(Object newItem);
    public void insertLast(Object newItem);
    public Object removeFirst() throws ListEmptyException;
    public Object removeLast() throws ListEmptyException;
}

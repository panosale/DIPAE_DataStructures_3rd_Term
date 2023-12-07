public interface List {
    public boolean isEmpty( );
    public int getSize();
    public void insertFirst(Object newItem);
    public void insertLast(Object newItem);
    public Object removeFirst() throws ListEmptyException;
    public Object removeLast() throws ListEmptyException;
}

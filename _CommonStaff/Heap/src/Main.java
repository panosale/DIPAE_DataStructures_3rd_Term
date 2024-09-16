// ΥΛΟΠΟΙΗΣΗ ΣΩΡΟΥ ΜΕ ΣΧΕΔΟΝ ΠΛΗΡΕΣ ΔΕΝΤΡΟ
public class Main {
    public static boolean heapSort(Object[] array) { // ΝΑ ΔΟΚΙΜΑΣΤΕΙ ΑΥΤΗ function
        Heap tranfserHeap = new Heap(array.length);
        try {
            for (int i = 0; i < array.length; i++)
                tranfserHeap.insert(array[i]);
            int size = tranfserHeap.size();
            for (int i = size - 1; i >= 0; i--)
                array[i] = tranfserHeap.remove();
            return true;
        }
        catch (HeapFullException Error) {
            System.out.println("Ο πίνακας είναι πολύ μεγάλος. Η ταξινόμηση είναι αδύνατη.");
            return false;
        }
    } // End of function: public heapSort()

    public static void main(String[] args) {
        System.out.println("Hello world!\nToday we are implementing and testing the Heap Data Structure.");
    }
}
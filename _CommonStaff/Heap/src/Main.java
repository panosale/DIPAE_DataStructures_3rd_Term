// ΥΛΟΠΟΙΗΣΗ ΣΩΡΟΥ ΜΕ ΣΧΕΔΟΝ ΠΛΗΡΕΣ ΔΕΝΤΡΟ
public class Main {
    public static boolean heapSort(Object[] array) {
        Heap tranfserHeap = new Heap(array.length);
        if (array.length == 0) {
            System.out.println("Ο πίνακας που δόθηκε είναι κενός. Η ταξινόμηση είναι αδύνατη.");
            return false;
        }
        for (int i = 0; i < array.length; i++)
            tranfserHeap.insert(array[i]);
        int size = tranfserHeap.size();
        for (int i = size - 1; i >= 0; i--)
            array[i] = tranfserHeap.remove();
        return true;
//        try {
//            for (int i = 0; i < array.length; i++)
//                tranfserHeap.insert(array[i]);
//            int size = tranfserHeap.size();
//            for (int i = size - 1; i >= 0; i--)
//                array[i] = tranfserHeap.remove();
//            return true;
//        }
//        catch (HeapFullException Error) {
//            System.out.println("Ο πίνακας είναι πολύ μεγάλος. Η ταξινόμηση είναι αδύνατη.");
//            return false;
//        }
    } // End of function: public heapSort()

    public static void main(String[] args) {
        System.out.println("Hello world!\nToday we are implementing and testing the Heap Data Structure.");
        String matrix[] = {
                "Πάνος", "Νικολέτα", "Γεώργιος", "Ελένη", "Μαρία", "Λουκάς", "Κωνσταντίνος",
                "Αλεξάνδρα", "Μαρία", "Νικόλαος", "Φοίβος", "Απόστολος"
        };
//        String matrix[] = {};
        System.out.println("*** UNSORTED matrix ARRAY ***");
        for (int i = 0; i < matrix.length; i++)
            System.out.println(matrix[i] + ", ");
        if (heapSort(matrix)) {
            System.out.println("*** SORTED matrix ARRAY ***");
            for (int i = 0; i < matrix.length; i++)
                System.out.println(matrix[i] + ", ");

        }
    }
}
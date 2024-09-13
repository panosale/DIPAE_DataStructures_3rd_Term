public class LinkedList implements List {
    // Υλοποίηση μιας απλά Συνδεδεμένης Λίστας (linked list)
    public static final String MSG_LIST_EMPTY = "Η λίστα είναι κενή!"; // Δήλωση σταθεράς μηνύματος κενής λίστας
    private Node firstNode, lastNode;
    public LinkedList() { // Default constructor
        this.firstNode = this.lastNode = null;
    } // End of Default constructor
    public Node getFirstNode() {
        return this.firstNode;
    } // End of function: getFirstNode()
    public Node getLastNode() {
        return this.lastNode;
    }  // End of function: getLastNode()
    public boolean isEmpty() {
        return (this.firstNode == null); // Επιστρέφει true (η λίστα είναι κενή) αν ο πρώτος κόμβος είναι null
    } // End of function: isEmpty()
    @Override
    public int getSize() { // Να ελεγχθεί αν είναι σωστή
        int listSize = 0;
        // Υλοποίηση με while - ΑΡΧΗ
        if (this.isEmpty())
            System.out.println(MSG_LIST_EMPTY); // Γιατί όχι το? -> throw new ListEmptyException(MSG_LIST_EMPTY);
        else {
            Node position = this.firstNode;
            while (position != null) {
                position = position.getNext();
                listSize++;
            }
        }
        // Υλοποίηση με while - ΤΕΛΟΣ
        // Υλοποίηση με for - ΑΡΧΗ
/*
        for (Node position = this.firstNode; position != null; position = position.getNext())
            listSize++;
*/
        // Υλοποίηση με for - ΤΕΛΟΣ
        return listSize;
    } // End of function: getSize()
    public void insertFirst(Object newItem) {
        if (this.isEmpty())
            this.firstNode = this.lastNode = new Node(newItem, null);
        else
            this.firstNode = new Node(newItem, this.firstNode);
    } // End of function: insertFirst()
    public void insertLast(Object newItem) {
        if (this.isEmpty())
            this.firstNode = this.lastNode = new Node(newItem, null);
        else
            this.lastNode = this.lastNode.next = new Node(newItem, null);
    } // End of function: insertLast()
    public Object removeFirst() throws ListEmptyException {
        if (this.isEmpty())
            throw new ListEmptyException(MSG_LIST_EMPTY);
        Object removedItem = this.firstNode.item;
        if (this.firstNode == this.lastNode)
//        if (this.firstNode.equals(this.lastNode)) // Με την .equals. Για δοκιμή
            this.firstNode = this.lastNode = null;
        else
            this.firstNode = this.firstNode.next;
        return removedItem;
    } // End of function: removeFirst()
    public Object removeLast() throws ListEmptyException {
        if (this.isEmpty())
            throw new ListEmptyException(MSG_LIST_EMPTY);
        Object removedItem = this.lastNode.item;
        if (this.firstNode == this.lastNode)
//        if (this.firstNode.equals(this.lastNode)) // Με την .equals. Για δοκιμή
            this.firstNode = this.lastNode = null;
        else {
            // Υλοποίηση με while - ΑΡΧΗ
            Node currentNode = this.firstNode;
            while (currentNode.next != this.lastNode)
                currentNode = currentNode.next;
            // Υλοποίηση με while - ΤΕΛΟΣ
            // Υλοποίηση με for - ΑΡΧΗ
/*
            Node position;
            for (position = this.firstNode; position.getNext() != this.lastNode;
                 position = position.getNext()) {
                this.lastNode = position;
                position.setNext(null);
            }
*/
            // Υλοποίηση με for - ΤΕΛΟΣ
            this.lastNode = currentNode;
            currentNode.next = null;
        }
        return removedItem;
    } // End of function: removeLast()
    public void printList() {
        if (this.isEmpty())
            System.out.println(MSG_LIST_EMPTY); // Γιατί όχι το? -> throw new ListEmptyException(MSG_LIST_EMPTY);
            // Προφανώς για να μην σταματάει το πρόγραμμα μόνο και μόνο για την προβολή της κενής λίστας
        else {
            Node currentNode = this.firstNode;
            while (currentNode != null) {
                System.out.println(currentNode.item.toString() + " ");
                currentNode = currentNode.next;
            }
            //System.out.println("\n");
        }
    } // End of function: printList()
    public Object minOfList() {
        if (this.isEmpty())
            throw new ListEmptyException(MSG_LIST_EMPTY);
        Object min = this.firstNode.getItem();
        Node position = this.firstNode.getNext();
        while (position != null) {
            // Υλοποίηση χωρίς Comparable - ΑΡΧΗ
            if (((String)min).compareTo((String) position.getItem()) > 0) // <--- Αλλαγή στο casting στον τύπο αντικειμένου που μας ενδιαφέρει (προεπιλεγμένο: String)
                // Υλοποίηση χωρίς Comparable - ΤΕΛΟΣ
                // Υλοποίηση με Comparable - ΑΡΧΗ
//            Comparable CompMax = (Comparable)max;
//            Comparable CompItem = (Comparable)position.getItem();
//            if (CompMax.compareTo(CompItem) < 0)
                // Υλοποίηση με Comparable - ΤΕΛΟΣ
                min = position.getItem();
            // Εναλλακτικά μέσα στην if - ΑΡΧΗ
//            if (((Comparable)max).compareTo((Comparable)position.getItem()) > 0) // Ο παρακάτω έλεγχος γίνεται και έτσι
//            if (((String)min).compareTo((String) position.getItem()) > 0) // <--- Αλλαγή στο casting στον τύπο αντικειμένου που μας ενδιαφέρει (προεπιλεγμένο: String)
//                min = position.getItem();
            // Εναλλακτικά μέσα στην if - ΤΕΛΟΣ
            position = position.getNext();
        }
        return min;
    } // End of function: minOfList()
    public Object maxOfList() {
        if (this.isEmpty())
            throw new ListEmptyException(MSG_LIST_EMPTY);
        Object max = this.firstNode.getItem();
        Node position = this.firstNode.getNext();
        while (position != null) {
            // Υλοποίηση χωρίς Comparable - ΑΡΧΗ
            if (((String)max).compareTo((String) position.getItem()) < 0) // <--- Αλλαγή στο casting στον τύπο αντικειμένου που μας ενδιαφέρει (προεπιλεγμένο: String)
                // Υλοποίηση χωρίς Comparable - ΤΕΛΟΣ
                // Υλοποίηση με Comparable - ΑΡΧΗ
//            Comparable CompMax = (Comparable)max;
//            Comparable CompItem = (Comparable)position.getItem();
//            if (CompMax.compareTo(CompItem) < 0)
                // Υλοποίηση με Comparable - ΤΕΛΟΣ
                max = position.getItem();
            // Εναλλακτικά μέσα στην if - ΑΡΧΗ
//            if (((Comparable)max).compareTo((Comparable)position.getItem()) < 0) // Ο παρακάτω έλεγχος γίνεται και έτσι
            // Εναλλακτικά μέσα στην if - ΤΕΛΟΣ
            position = position.getNext();
        }
        return max;
    } // End of function: maxOfList()

/*  // Προηγούμενη έκδοση
    public Object maxOfList() {
        if (this.isEmpty())
            throw new ListEmptyException(MSG_LIST_EMPTY);
        Object max = this.firstNode.getItem();
        Node position = this.firstNode.getNext();
        while (position != null) {
            Comparable CompMax = (Comparable)max;
            Comparable CompItem = (Comparable)position.getItem();
            if (CompMax.compareTo(CompItem) < 0)
                max = position.getItem();
            // Εναλλακτικά μέσα στην if - ΑΡΧΗ
*/
/*
            if (((Comparable)max).compareTo((Comparable)position.getItem()) < 0)
                max = position.getItem();
*//*

            // Εναλλακτικά μέσα στην if - ΤΕΛΟΣ
            position = position.getNext();
        }
        return max;
    } // End of function: maxOfList()
*/
    public Object[] minMaxOfList() { // Επιστρέφει πίνακα δυο θέσεων που περιέχει την ελάχιστη και μέγιστη τιμή που θα βρει στη λίστα
        if (this.isEmpty())
            throw new ListEmptyException(MSG_LIST_EMPTY);
        Object[] minMax = new Object[2];
        minMax[0] = this.minOfList();
        minMax[1] = this.maxOfList();
        return minMax;
    } // End of function: minMaxOfList()
        public void minMaxOfListByRef(Object[] pin) { // Επιστρέφει ΜΕ ΑΝΑΦΟΡΑ πίνακα δυο θέσεων που περιέχει την ελάχιστη και μέγιστη τιμή που θα βρει στη λίστα
            if (this.isEmpty())
                throw new ListEmptyException(MSG_LIST_EMPTY);
            Object[] minMax = new Object[2];
            pin[0] = this.minOfList();
            pin[1] = this.maxOfList();
    } // End of function: minMaxOfList()
    public boolean nodeExist(Object item) {
        if (this.isEmpty())
            throw new ListEmptyException(MSG_LIST_EMPTY);
        boolean found = false;
        Node tmpNode = this.firstNode.getNext();
        while (tmpNode != null && !found)
//            if (tmpNode.getItem().equals(item))
            if (((Comparable)tmpNode.getItem()).compareTo(item) == 0) // Πιο γενική μορφή
                found = true;
            else
                tmpNode = tmpNode.getNext();
        return found;
    } // End of function: nodeExist()
    public LinkedList sortList() {
        if (this.isEmpty())
            throw new ListEmptyException(MSG_LIST_EMPTY);
        if (this.getSize() == 1) {
            System.out.println("Η λίστα έχει μέγεθος 1. Δεν χρειάζεται ταξινόμηση.");
            return this;
        }
        Node traceNode, currentNode, minNode;
        traceNode = this.getFirstNode(); // Από το traceNode και δεξιά η λίστα δεν είναι ταξινομημένη
        while (traceNode != null) {
            currentNode = traceNode;
            minNode = traceNode;
            while (currentNode != null) {
//                Comparable CompCurrentNode = (Comparable) currentNode.getItem(); // Ο παρακάτω έλεγχος γίνεται και έτσι
//                if (CompCurrentNode.compareTo(minNode.getItem()) < 0) // Ο παρακάτω έλεγχος γίνεται και έτσι
                if (((String)(currentNode.getItem())).compareTo((String)(minNode.getItem())) < 0) // Αύξουσα ταξινόμηση
                    minNode = currentNode;
                currentNode = currentNode.getNext();
            } // End of while: currentNode
            Object temp = traceNode.getItem(); // Έλεγχος εδώ
            traceNode.setItem(minNode.getItem()); // Swap
            minNode.setItem(temp); // Swap
            traceNode = traceNode.getNext(); // Swap
        } // End of while: traceNode
        return this;
    } // End of function: sortList()
    public LinkedList bubbleSort() {
        if (this.isEmpty())
            throw new ListEmptyException(MSG_LIST_EMPTY);
        if (this.getSize() == 1) {
            System.out.println("Η λίστα έχει μέγεθος 1. Δεν χρειάζεται ταξινόμηση.");
            return this;
        }
        Node currentNode = this.getFirstNode();
        while (currentNode != null) {
            Node secondNode = currentNode.getNext();
            while (secondNode != null) {
//                Comparable CompCurrentNode = (Comparable) currentNode.getItem(); // Ο παρακάτω έλεγχος γίνεται και έτσι
//                if (CompCurrentNode.compareTo(secondNode.getItem()) < 0) // Ο παρακάτω έλεγχος γίνεται και έτσι
                if (((String)(currentNode.getItem())).compareTo((String)(secondNode.getItem())) > 0) { // Αύξουσα ταξινόμηση
                    Object temp = currentNode.getItem(); // Swap
                    currentNode.setItem(secondNode.getItem()); // Swap
                    secondNode.setItem(temp); // Swap
                }
                secondNode = secondNode.getNext();
            } // End of while: secondNode
            currentNode = currentNode.getNext();
        } // End of while: currentNode
        return this;
    } // End of function: bubbleSort()
}

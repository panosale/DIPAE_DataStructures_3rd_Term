public class StudentsLinkedList extends LinkedList {
    public boolean nodeExist(int item) { // Υπέρβαση της μεθόδου της γονικής κλάσης
        if (this.isEmpty())
            throw new ListEmptyException(MSG_LIST_EMPTY);
        Node tmpNode = this.getFirstNode();
        while (tmpNode != null)
            if (((Student)tmpNode.getItem()).getAM() == item)
                return true;
            else
                tmpNode = tmpNode.getNext();
        return false;
    } // End of function: nodeExist()
    public Object minOfList() { // Υπέρβαση της μεθόδου της γονικής κλάσης
        if (this.isEmpty())
            throw new ListEmptyException(MSG_LIST_EMPTY);
        Object min = this.getFirstNode().getItem();
        Node position = this.getFirstNode().getNext();
        while (position != null) {
            if ((((Student)min).compareTo(position.getItem()) > 0)) // <--- Αλλαγή στο casting στον τύπο αντικειμένου που μας ενδιαφέρει (προεπιλεγμένο: String)
                min = position.getItem();
            position = position.getNext();
        }
        return min;
    } // End of function: minOfList()
    public Object maxOfList() { // Υπέρβαση της μεθόδου της γονικής κλάσης
        if (this.isEmpty())
            throw new ListEmptyException(MSG_LIST_EMPTY);
        Object max = this.getFirstNode().getItem();
        Node position = this.getFirstNode().getNext();
        while (position != null) {
            if ((((Student)max).compareTo(position.getItem()) < 0)) // <--- Αλλαγή στο casting στον τύπο αντικειμένου που μας ενδιαφέρει (προεπιλεγμένο: String)
                max = position.getItem();
            position = position.getNext();
        }
        return max;
    } // End of function: maxOfList()
    public Object minGradeOfList() { // Υπέρβαση της μεθόδου της γονικής κλάσης. Πρέπει να επιστρέφει τον σπουδαστή και όχι μόνο τον βαθμό του
        if (this.isEmpty())
            throw new ListEmptyException(MSG_LIST_EMPTY);
        double minGrade = ((Student)this.getFirstNode().getItem()).getVathmos(); // <--- Αλλαγή στο casting στον τύπο αντικειμένου που μας ενδιαφέρει (προεπιλεγμένο: Δεν χρειάζεται casting)
        Object minStudent = this.getFirstNode().getItem();
        Node position = this.getFirstNode().getNext();
        while (position != null) {
            if ((((Comparable<Double>)minGrade).compareTo(((Student)position.getItem()).getVathmos()) > 0)) {// <--- Αλλαγή στο casting στον τύπο αντικειμένου που μας ενδιαφέρει (προεπιλεγμένο: String)
                minGrade = ((Student) position.getItem()).getVathmos();
                minStudent = position.getItem();
            }
            position = position.getNext();
        }
        return minStudent;
    } // End of function: minGradeOfList()
    public Object maxGradeOfList() { // Υπέρβαση της μεθόδου της γονικής κλάσης. Πρέπει να επιστρέφει τον σπουδαστή και όχι μόνο τον βαθμό του.
        if (this.isEmpty())
            throw new ListEmptyException(MSG_LIST_EMPTY);
        double maxGrade = ((Student)this.getFirstNode().getItem()).getVathmos(); // <--- Αλλαγή στο casting στον τύπο αντικειμένου που μας ενδιαφέρει (προεπιλεγμένο: Δεν χρειάζεται casting)
        Object maxStudent = this.getFirstNode().getItem();
        Node position = this.getFirstNode().getNext();
        while (position != null) {
            if ((((Comparable<Double>)maxGrade).compareTo(((Student)position.getItem()).getVathmos()) < 0)) { // <--- Αλλαγή στο casting στον τύπο αντικειμένου που μας ενδιαφέρει (προεπιλεγμένο: String)
                maxGrade = ((Student) position.getItem()).getVathmos();
                maxStudent = position.getItem();
            }
            position = position.getNext();
        }
        return maxStudent;
    } // End of function: maxGradeOfList()
    public Object[] minMaxGradeOfList() { // Υπέρβαση της μεθόδου της γονικής κλάσης. Επιστρέφει πίνακα δυο θέσεων που περιέχει την ελάχιστη και μέγιστη τιμή που θα βρει στη λίστα
        if (this.isEmpty())
            throw new ListEmptyException(MSG_LIST_EMPTY);
        Object[] minMax = new Object[2];
        minMax[0] = this.minGradeOfList();
        minMax[1] = this.maxGradeOfList();
        return minMax;
    } // End of function: minMaxGradeOfList()
    public LinkedList sortList() { // Υπέρβαση της μεθόδου της γονικής κλάσης
        Node traceNode, currentNode, minNode;
        traceNode = this.getFirstNode(); // Από to traceNode και δεξιά η λίστα δεν είναι ταξινομημένη
        while (traceNode != null) {
            currentNode = traceNode;
            minNode = traceNode;
            while (currentNode != null) {
//                Comparable CompCurrentNode = (Comparable) currentNode.getItem(); // Ο παρακάτω έλεγχος γίνεται και έτσι
//                if (CompCurrentNode.compareTo(minNode.getItem()) < 0) // Ο παρακάτω έλεγχος γίνεται και έτσι
                // Στην παρακάτω γραμμή έγινε αλλαγή ώστε να ταξινομούνται αντικείμενα τύπου Student. Προεπιλεγμένο: String
                if (((Student)(currentNode.getItem())).compareTo((minNode.getItem())) < 0) // Αύξουσα ταξινόμηση
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
    public LinkedList bubbleSort() { // Υπέρβαση της μεθόδου της γονικής κλάσης
        Node currentNode = this.getFirstNode();
        while (currentNode != null) {
            Node secondNode = currentNode.getNext();
            while (secondNode != null) {
//                Comparable CompCurrentNode = (Comparable) currentNode.getItem(); // Ο παρακάτω έλεγχος γίνεται και έτσι
//                if (CompCurrentNode.compareTo(secondNode.getItem()) < 0) // Ο παρακάτω έλεγχος γίνεται και έτσι
                // Στην παρακάτω γραμμή έγινε αλλαγή ώστε να ταξινομούνται αντικείμενα τύπου Student. Προεπιλεγμένο: String
                if (((Student)(currentNode.getItem())).compareTo((secondNode.getItem())) > 0) { // Αύξουσα ταξινόμηση
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

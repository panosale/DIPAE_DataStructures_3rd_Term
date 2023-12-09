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
    public Object minGradeOfList() { // Πρέπει να επιστρέφει τον σπουδαστή και όχι μόνο τον βαθμό του
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
    public Object maxGradeOfList() { // Πρέπει να επιστρέφει τον σπουδαστή και όχι μόνο τον βαθμό του
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
    public Object[] minMaxGradeOfList() { // Επιστρέφει πίνακα δυο θέσεων που περιέχει την ελάχιστη και μέγιστη τιμή που θα βρει στη λίστα
        if (this.isEmpty())
            throw new ListEmptyException(MSG_LIST_EMPTY);
        Object[] minMax = new Object[2];
        minMax[0] = this.minGradeOfList();
        minMax[1] = this.maxGradeOfList();
        return minMax;
    } // End of function: minMaxGradeOfList()

}

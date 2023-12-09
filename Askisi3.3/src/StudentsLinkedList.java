public class StudentsLinkedList extends LinkedList {
    public Object minGradeOfList() { // Πρέπει να επιστρέφει τον σπουδαστή και όχι μόνο τον βαθμό του
        if (this.isEmpty())
            throw new ListEmptyException(MSG_LIST_EMPTY);
        double minGrade = ((Student)super.getFirstNode().getItem()).getVathmos(); // <--- Αλλαγή στο casting στον τύπο αντικειμένου που μας ενδιαφέρει (προεπιλεγμένο: Δεν χρειάζεται casting)
        Object minStudent = super.getFirstNode().getItem();
        Node position = super.getFirstNode().getNext();
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
        double maxGrade = ((Student)super.getFirstNode().getItem()).getVathmos(); // <--- Αλλαγή στο casting στον τύπο αντικειμένου που μας ενδιαφέρει (προεπιλεγμένο: Δεν χρειάζεται casting)
        Object maxStudent = super.getFirstNode().getItem();
        Node position = super.getFirstNode().getNext();
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

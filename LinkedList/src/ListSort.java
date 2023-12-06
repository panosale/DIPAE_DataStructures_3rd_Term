public class ListSort extends LinkedList {
    public ListSort() {
        super();
    }
    public LinkedList sortList() {
        Node traceNode, currentNode, minNode;
        traceNode = this.getFirstNode();
        while (traceNode != null) {
            currentNode = traceNode;
            minNode = traceNode;
            Comparable CompCurrentNode = (Comparable) currentNode.getItem();
            Comparable CompMinNode = (Comparable) minNode.getItem();
            while (currentNode != null) {
                if (CompCurrentNode.compareTo(CompMinNode) < 0) // Έλεγχος εδώ. Μπορεί να βγάλει σφάλμα
                    minNode = currentNode;
                currentNode = currentNode.getNext();
            }
            Object temp = traceNode.getItem(); // Έλεγχος εδώ
            traceNode.setItem(minNode.getItem());
            minNode.setItem(temp);
            traceNode = traceNode.getNext();
        }
        return this;
    }
}

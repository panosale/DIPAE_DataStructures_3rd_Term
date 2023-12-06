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
            while (currentNode != null) {
                if ((currentNode.getItem()).compareTo(minNode.getItem()) < 0) // Έλεγχος εδώ. Πρέπει να γίνει ένα comparable
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

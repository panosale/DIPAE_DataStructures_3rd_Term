public class GTreeNode<E> {
    private GTreeNode left;
    private E item;
    private GTreeNode right;
    public GTreeNode(E data) { // Default constructor
        item = data;
        left = right = null;
    } // End of: Default constructor
    // Getters & Setters
    public void setNodeData(E newItem) {
        this.item = newItem;
    } // End of function: setNodeData()
    public E getNodeData() {
        return this.item;
    } // End of function: getNodeData()
    public void setLeftNode(GTreeNode newLeft) {
        this.left = newLeft;
    } // End of function: setLeftNode()
    public GTreeNode getLeftNode() {
        return this.left;
    } // End of function: getLeftNode()
    public void setRightNode(GTreeNode newRightNode) {
        this.right = newRightNode;
    } // End of function: setRightNode()
    public GTreeNode getRightNode() {
        return this.right;
    } // End of function: getRightNode()
    // ΖΗΤΟΥΜΕΝΑ ΑΣΚΗΣΗΣ 5Α.1
    public boolean isLeaf() {
        return (this.left == null) && (this.right == null);
    } // End of function: isLeaf()
}

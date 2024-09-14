public class TreeNode {
    private TreeNode left;
    private Object item;
    private TreeNode right;
    public TreeNode(Object data) { // Default constructor
        item = data;
        left = right = null;
    } // End of: Default constructor
    // Getters & Setters
    public void setNodeData(Object newItem) { // ΔΕΝ ΧΡΕΙΑΖΕΤΑΙ. ΓΙΑ ΔΙΑΓΡΑΦΗ?
        this.item = newItem; // ΔΕΝ ΧΡΕΙΑΖΕΤΑΙ. ΓΙΑ ΔΙΑΓΡΑΦΗ?
    } // End of function: setNodeData() // ΔΕΝ ΧΡΕΙΑΖΕΤΑΙ. ΓΙΑ ΔΙΑΓΡΑΦΗ?
    public Object getNodeData() {
        return this.item;
    } // End of function: getNodeData()
    public void setLeftNode(TreeNode newLeft) {
        this.left = newLeft;
    } // End of function: setLeftNode()
    public TreeNode getLeftNode() {
        return this.left;
    } // End of function: getLeftNode()
    public void setRightNode(TreeNode newRightNode) {
        this.right = newRightNode;
    } // End of function: setRightNode()
    public TreeNode getRightNode() {
        return this.right;
    } // End of function: getRightNode()
    // ΖΗΤΟΥΜΕΝΑ ΑΣΚΗΣΗΣ 5.1
    public boolean isLeaf() {
        return ((this.left.getNodeData() == null) && (this.right.getRightNode() == null));
    }
}

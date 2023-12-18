public class TreeNode {
    private TreeNode leftNode;
    private int item;
    private TreeNode rightNode;
    public TreeNode(int data) { // Default constructor
        item = data;
        leftNode = rightNode = null;
    } // End of: Default constructor
    // Getters & Setters
    public void setNodeData(int newItem) {
        this.item = newItem;
    } // End of function: setNodeData()
    public int getNodeData() {
        return this.item;
    } // End of function: getNodeData()
    public void setLeftNode(TreeNode newLeftNode) {
        this.leftNode = newLeftNode;
    } // End of function: setLeftNode()
    public TreeNode getLeftNode() {
        return this.leftNode;
    } // End of function: getLeftNode()
    public void setRightNode(TreeNode newRightNode) {
        this.rightNode = newRightNode;
    } // End of function: setRightNode()
    public TreeNode getRightNode() {
        return this.rightNode;
    } // End of function: getRightNode()

}

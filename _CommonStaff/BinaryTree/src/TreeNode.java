public class TreeNode {
    private TreeNode left;
    private int item;
    private TreeNode right;
    public TreeNode(int data) { // Default constructor
        item = data;
        left = right = null;
    } // End of: Default constructor
    // Getters & Setters
    public void setNodeData(char newItem) {
        this.item = newItem;
    } // End of function: setNodeData()
    public int getNodeData() {
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

}

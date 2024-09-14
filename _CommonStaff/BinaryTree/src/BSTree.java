public class  BSTree {
    private TreeNode root;
    public BSTree() { // Default constructor
        root = null;
    } // End of: Default constructor
    public boolean isEmpty() {
        return (root == null);
    } // End of function: isEmpty()
    public void insertElement(int newData) {
        if (this.isEmpty())
            root = new TreeNode(newData);
        else
            this.insertNode(newData, root);
    } // End of function: insertElement()
    private void insertNode(int newData, TreeNode newNode) {
        if (newData < newNode.getNodeData()) {
            if (newNode.getLeftNode() == null)
                newNode.setLeftNode(new TreeNode(newData));
            else
                insertNode(newData, newNode.getLeftNode());
        }
        else {
            if (newNode.getRightNode() == null)
                newNode.setRightNode(new TreeNode(newData));
            else
                insertNode(newData, newNode.getRightNode());
        }
    } // End of function: insertNode()
    // ΕΝΘΕΜΑΤΙΚΗ ΔΙΕΛΕΥΣΗ (InOrderTraversal) ΑΠΟ ΤΟΥΣ ΚΟΜΒΟΥΣ ΤΟΥ ΔΥΑΔΙΚΟΥ ΔΕΝΤΡΟΥ
    public void inOrderTraversal() {
        inOrder(root);
    } // End of function: inOrderTraversal()
    private void inOrder(TreeNode node) {
        if (node == null)
            return;
        inOrder(node.getLeftNode());
        System.out.print(node.getNodeData() + "|"); // <--- ΠΡΟΣΟΧΗ ΕΔΩ!
        inOrder(node.getRightNode());
    } // End of function: inOrder()
    // ΠΡΟΘΕΜΑΤΙΚΗ ΔΙΕΛΕΥΣΗ (PreOrderTraversal) ΑΠΟ ΤΟΥΣ ΚΟΜΒΟΥΣ ΤΟΥ ΔΥΑΔΙΚΟΥ ΔΕΝΤΡΟΥ
    public void preOrderTraversal() {
        preOrder(root);
    } // End of function: preOrderTraversal()
    private void preOrder(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.getNodeData() + "|"); // <--- ΠΡΟΣΟΧΗ ΕΔΩ!
        preOrder(node.getLeftNode());
        preOrder(node.getRightNode());
    } // End of function: preOrder()
    // ΕΠΙΘΕΜΑΤΙΚΗ/ΜΕΤΑΘΕΜΑΤΙΚΗ ΔΙΕΛΕΥΣΗ (PostOrderTraversal) ΑΠΟ ΤΟΥΣ ΚΟΜΒΟΥΣ ΤΟΥ ΔΥΑΔΙΚΟΥ ΔΕΝΤΡΟΥ
    public void postOrderTraversal() {
        postOrder(root);
    } // End of function: postOrderTraversal()
    private void postOrder(TreeNode node) {
        if (node == null)
            return;
        postOrder(node.getLeftNode());
        postOrder(node.getRightNode());
        System.out.print(node.getNodeData() + "|"); // <--- ΠΡΟΣΟΧΗ ΕΔΩ!
    } // End of function: postOrder()
    // ΔΥΑΔΙΚΑ ΔΕΝΤΡΑ
    public int countNodes() { // ΜΕΤΡΗΣΗ ΤΩΝ ΚΟΜΒΩΝ/ΑΚΜΩΝ ΤΟΥ ΔΕΝΤΡΟΥ
        return countNodes(root);
    } // End of function: countNodes()
    private int countNodes(TreeNode node) {
        if (node == null)
            return 0;
        else
            return (countNodes(node.getLeftNode()) + countNodes(node.getRightNode()) + 1);
    } // End of function: countNodes()
    public int countLeafs() { // ΜΕΤΡΗΣΗ ΤΩΝ ΦΥΛΩΝ/ΚΟΡΥΦΩΝ ΤΟΥ ΔΕΝΤΡΟΥ
        return countLeafs(root);
    } // End of function: countLeafs()
    private int countLeafs(TreeNode node) { // ΜΕΤΡΗΣΗ ΤΩΝ ΦΥΛΛΩΝ/ΚΟΡΥΦΩΝ ΤΟΥ ΔΕΝΤΡΟΥ
        if (node == null)
            return 0;
        else {
            int count = 0;
            count += countLeafs(node.getLeftNode());
            count += countLeafs(node.getRightNode());
            if ((node.getLeftNode() == null) && (node.getRightNode() == null))
                count++;
            return count;
        }
    } // End of function: countLeafs()
}

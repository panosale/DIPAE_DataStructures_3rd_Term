// TODO:  ΝΑ ΑΛΛΑΞΩ ΌΛΟΥΣ ΤΟΥΣ ΕΛΕΓΧΟΥΣ ΣΕ (Comparable)
public class GBSTree<E> {
    private GTreeNode root;
    public GBSTree() { // Default constructor
        root = null;
    } // End of: Default constructor
    public boolean isEmpty() {
        return (root == null);
    } // End of function: isEmpty()
    public void insertElement(E newData) {
        if (this.isEmpty())
            root = new GTreeNode(newData);
        else
            this.insertNode(newData, root);
    } // End of function: insertElement()
    private void insertNode(E newData, GTreeNode newNode) {
        // TODO: ΝΑ ΕΠΙΒΕΒΑΙΩΣΩ ΤΑ ΠΑΡΑΚΑΤΩ
        if (((Comparable)newData).compareTo((newNode.getNodeData())) < 0) { // ΑΚΟΛΟΥΘΕΙ ΕΞΗΓΗΣΗ ΤΩΝ ΑΠΟΤΕΛΕΣΜΑΤΩΝ ΤΟΥ Comparable
            // ΑΝ < 0 ΤΟ .newData ΕΙΝΑΙ ΜΙΚΡΟΤΕΡΟ ΑΠΌ ΤΟ  newNode.getNodeData()
            // ΑΝ = 0 ΤΟ .newData ΕΙΝΑΙ ΙΣΟ ΜΕ ΤΟ  newNode.getNodeData()
            // ΑΝ > 0 ΤΟ .newData ΕΙΝΑΙ ΜΕΓΑΛΥΤΕΡΟ ΑΠΌ ΤΟ  newNode.getNodeData()
            if (newNode.getLeftNode() == null)
                newNode.setLeftNode(new GTreeNode(newData));
            else
                insertNode(newData, newNode.getLeftNode());
        }
        else {
            if (newNode.getRightNode() == null)
                newNode.setRightNode(new GTreeNode(newData));
            else
                insertNode(newData, newNode.getRightNode());
        }
    } // End of function: insertNode()
    // ΕΝΘΕΜΑΤΙΚΗ ΔΙΕΛΕΥΣΗ (InOrderTraversal) ΑΠΟ ΤΟΥΣ ΚΟΜΒΟΥΣ ΤΟΥ ΔΥΑΔΙΚΟΥ ΔΕΝΤΡΟΥ
    public void inOrderTraversal() {
        inOrder(root);
    } // End of function: inOrderTraversal()
    private void inOrder(GTreeNode node) {
        if (node == null)
            return;
        inOrder(node.getLeftNode());
        System.out.print(node.getNodeData().toString() + "|"); // <--- ΠΡΟΣΟΧΗ ΕΔΩ! Η ΕΚΤΥΠΩΣΗ ΠΡΕΠΕΙ ΝΑ ΒΡΙΣΚΕΤΑΙ ΑΚΡΙΒΩΣ ΣΕ ΑΥΤΗ ΤΗ ΘΕΣΗ
        inOrder(node.getRightNode());
    } // End of function: inOrder()
    // ΠΡΟΘΕΜΑΤΙΚΗ ΔΙΕΛΕΥΣΗ (PreOrderTraversal) ΑΠΟ ΤΟΥΣ ΚΟΜΒΟΥΣ ΤΟΥ ΔΥΑΔΙΚΟΥ ΔΕΝΤΡΟΥ
    public void preOrderTraversal() {
        preOrder(root);
    } // End of function: preOrderTraversal()
    private void preOrder(GTreeNode node) {
        if (node == null)
            return;
        System.out.print(node.getNodeData().toString() + "|"); // <--- ΠΡΟΣΟΧΗ ΕΔΩ! Η ΕΚΤΥΠΩΣΗ ΠΡΕΠΕΙ ΝΑ ΒΡΙΣΚΕΤΑΙ ΑΚΡΙΒΩΣ ΣΕ ΑΥΤΗ ΤΗ ΘΕΣΗ
        preOrder(node.getLeftNode());
        preOrder(node.getRightNode());
    } // End of function: preOrder()
    // ΕΠΙΘΕΜΑΤΙΚΗ/ΜΕΤΑΘΕΜΑΤΙΚΗ ΔΙΕΛΕΥΣΗ (PostOrderTraversal) ΑΠΟ ΤΟΥΣ ΚΟΜΒΟΥΣ ΤΟΥ ΔΥΑΔΙΚΟΥ ΔΕΝΤΡΟΥ
    public void postOrderTraversal() {
        postOrder(root);
    } // End of function: postOrderTraversal()
    private void postOrder(GTreeNode node) {
        if (node == null)
            return;
        postOrder(node.getLeftNode());
        postOrder(node.getRightNode());
        System.out.print(node.getNodeData().toString() + "|"); // <--- ΠΡΟΣΟΧΗ ΕΔΩ! Η ΕΚΤΥΠΩΣΗ ΠΡΕΠΕΙ ΝΑ ΒΡΙΣΚΕΤΑΙ ΑΚΡΙΒΩΣ ΣΕ ΑΥΤΗ ΤΗ ΘΕΣΗ
    } // End of function: postOrder()
    public int size() { // ΜΕΤΡΗΣΗ ΤΩΝ ΚΟΜΒΩΝ ΤΟΥ ΔΕΝΤΡΟΥ
        return size(root);
    } // End of function: public size()
    private int size(GTreeNode node) {
        if (node == null)
            return 0;
        else
            return (size(node.getLeftNode()) + size(node.getRightNode()) + 1);
    } // End of function: private size()
    // ΔΥΑΔΙΚΑ ΔΕΝΤΡΑ
    public int countNodes() { // ΜΕΤΡΗΣΗ ΤΩΝ ΚΟΜΒΩΝ ΤΟΥ ΔΕΝΤΡΟΥ - ΙΔΙΑ ΜΕ ΤΗΝ size()
        return countNodes(root);
    } // End of function: countNodes()
    private int countNodes(GTreeNode node) { // ΜΕΤΡΗΣΗ ΤΩΝ ΚΟΜΒΩΝ ΤΟΥ ΔΕΝΤΡΟΥ - ΙΔΙΑ ΜΕ ΤΗΝ size()
        if (node == null)
            return 0;
        else
            return (countNodes(node.getLeftNode()) + countNodes(node.getRightNode()) + 1);
    } // End of function: countNodes()
    public int countLeafs() { // ΜΕΤΡΗΣΗ ΤΩΝ ΦΥΛΩΝ/ΚΟΡΥΦΩΝ ΤΟΥ ΔΕΝΤΡΟΥ
        return countLeafs(root);
    } // End of function: countLeafs()
    private int countLeafs(GTreeNode node) { // ΜΕΤΡΗΣΗ ΤΩΝ ΦΥΛΛΩΝ/ΚΟΡΥΦΩΝ ΤΟΥ ΔΕΝΤΡΟΥ
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
    // ΖΗΤΟΥΜΕΝΑ ΑΣΚΗΣΗΣ 5Α.1
    public int numberOfNodes() { // Είναι ίδια με την countNodes()
        int numOfNodes = this.countNodes();
        return (numOfNodes);
    } // End of function: numberOfNodes()
    public int treeHeight() {
        return (treeHeight(root));
    } // End of function: public treeHeight() ver1
    private int treeHeight(GTreeNode node) {
        if (node == null)
            return -1;
        return (1 + Math.max(treeHeight(node.getLeftNode()), treeHeight(node.getRightNode())));
    } // End of function: private treeHeight() ver1
    public boolean search(E data) {
        return (search(root, data));
    } // End of function: public search()
    private boolean search(GTreeNode node, E data) {
        if (node == null)
            return false;
        if (node.getNodeData() == data)
            return true;
        if (search(node.getLeftNode(), data))
            return true;
        return (search(node.getRightNode(), data));
    } // End of function: private search()
    public int treeHeight(E data) {
        if (search(data)) return (treeHeight(root, data));
        return -1;
    } // End of function: public treeHeight() ver2
    private int treeHeight(GTreeNode node, E data) {
        if (node.getNodeData() == data)
            return 0;
        if (((Comparable)data).compareTo(node.getNodeData()) < 0)
            return (treeHeight(node.getLeftNode(), data) + 1);
        return (treeHeight(node.getRightNode()) + 1);
    } // End of function: private treeHeight() ver2
    // TODO: ΝΑ ΕΛΕΓΧΘΟΥΝ ΤΑ ΠΑΡΑΚΑΤΩ
    public Object[] inOrderSort() {
        Object[] array = new Object[this.countNodes()];
        inOrderSort(root, array, 0);
        return array;
    } // End of function: public inOrderSort()
    private int inOrderSort(GTreeNode node, Object[] pin, int i) {
        if (node == null)
            return i;
        i = inOrderSort(node.getLeftNode(), pin, i);
        pin[i] = node.getNodeData();
        i++;
        i = inOrderSort(node.getRightNode(), pin, i);
        return i;
    } // End of function: private inOrderSort()
    private int j; // Global private μεταβλητή της θέσης του δείκτη μέσα στον πίνακα για χρήση στην inOrderSort
    private Object[] table; // Global private πίνακας για χρήση στην inOrderSortGT
    public Object[] bsTreeSort() {
        table = new Object[this.countNodes()];
        inOrderSortGT(root);
        return table;
    } // End of function: public bsTreeSort()
    private void inOrderSortGT(GTreeNode node) {
        if (node == null)
            return;
        inOrderSortGT(node.getLeftNode());
        table[j++] = node.getNodeData();
        inOrderSortGT(node.getRightNode());
    } // End of function: private inOrderSortGT()
}

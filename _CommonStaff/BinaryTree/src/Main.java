// ΑΝΑΠΑΡΑΣΤΑΣΗ ΔΥΑΔΙΚΟΥ ΔΕΝΤΡΟΥ ΜΕ ΤΗ ΒΟΗΘΕΙΑ ΣΥΝΔΕΔΕΜΕΝΗΣ ΛΙΣΤΑΣ
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!\nToday we are testing a BSTree.");
        BSTree myTree = new BSTree();
        System.out.println("*** Initial total nodes of this BSTree are: " + myTree.countNodes());
        System.out.println("*** Initial total leafs of this BSTree are: " + myTree.countLeafs());
        myTree.insertElement(1);
        myTree.insertElement(2);
        myTree.insertElement(3);
        myTree.insertElement(4);
        myTree.insertElement(5);
        myTree.insertElement(6);
        myTree.insertElement(7);
        myTree.insertElement(8);
        myTree.insertElement(9);
        System.out.println("*** New elements have been inserted.");
        System.out.println("*** Total nodes of this BSTree are: " + myTree.countNodes());
        System.out.println("*** Total leafs of this BSTree are: " + myTree.countLeafs());
        System.out.print("*** Preorder traversal: |");
        myTree.preOrderTraversal();
        System.out.println();
        System.out.print("*** Inorder traversal: |");
        myTree.inOrderTraversal();
        System.out.println();
        System.out.print("*** Postorder traversal: |");
        myTree.postOrderTraversal();
        System.out.println();
    }
}
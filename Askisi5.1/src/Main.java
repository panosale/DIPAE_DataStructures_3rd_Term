// ΑΣΚΗΣΗ 5.1
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!\nToday we are testing a BSTree.");
        BSTree myTree = new BSTree();
        System.out.println("*** Initial total nodes of this BSTree are: " + myTree.countNodes());
        System.out.println("*** Initial total leafs of this BSTree are: " + myTree.countLeafs());
        myTree.insertElement('A');
        myTree.insertElement('H');
        myTree.insertElement('C');
        myTree.insertElement('D');
        myTree.insertElement('I');
        myTree.insertElement('F');
        myTree.insertElement('E');
        myTree.insertElement('G');
        myTree.insertElement('B');
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
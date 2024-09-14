// ΑΣΚΗΣΗ 5.1
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!\nToday we are testing a BSTree.");
        BSTree myTree = new BSTree();
        System.out.println("*** Initial total nodes of this BSTree are: " + myTree.countNodes());
        System.out.println("*** Initial total leafs of this BSTree are: " + myTree.countLeafs());
        int max = 7;
        for (int i = 0; i < max; i++)
            myTree.insertElement((int)(Math.random()*max*10));
//        myTree.insertElement('A');
//        myTree.insertElement('H');
//        myTree.insertElement('C');
//        myTree.insertElement('D');
//        myTree.insertElement('I');
//        myTree.insertElement('F');
//        myTree.insertElement('E');
//        myTree.insertElement('K');
//        myTree.insertElement('B');
//        myTree.insertElement('K');
//        myTree.insertElement('G');
        System.out.println("*** New elements have been inserted.");
        System.out.println("*** Total nodes of this BSTree are: " + myTree.countNodes());
        System.out.println("*** Total leafs of this BSTree are: " + myTree.countLeafs());
        System.out.print("*** Preorder traversal: |");
        myTree.preOrderTraversal();
        System.out.print("\n*** Inorder traversal: |");
        myTree.inOrderTraversal();
        System.out.print("\n*** Postorder traversal: |");
        myTree.postOrderTraversal();
        System.out.println();
        System.out.println("Number of nodes: " + myTree.numberOfNodes());
        System.out.println("Height of the tree: " + myTree.treeHeight());
    }
}
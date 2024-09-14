// ΑΣΚΗΣΗ 5.1
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!\nToday we are testing a BSTree.");
        BSTree myTree = new BSTree();
        System.out.println("*** Initial total nodes of this BSTree are: " + myTree.countNodes());
        System.out.println("*** Initial total leafs of this BSTree are: " + myTree.countLeafs());
        // ΓΕΜΙΣΜΑ ΜΕ ΤΥΧΑΙΟΥΣ ΑΡΙΘΜΟΥΣ
//        int max = 7;
//        for (int i = 0; i < max; i++)
//            myTree.insertElement((int)(Math.random()*max*10));
        int pin[] = {40, 15, 25, 50, 20, 10, 70, 55, 45, 5, 18};
        for (int i = 0; i < pin.length; i++)
            myTree.insertElement(pin[i]);

        System.out.println("*** New elements have been inserted.");
        System.out.println("*** Total nodes of this BSTree are: " + myTree.countNodes());
        System.out.println("*** Total leafs of this BSTree are: " + myTree.countLeafs());
        System.out.print("\n*** Inorder traversal: |");
        myTree.inOrderTraversal();
        System.out.print("\n*** Preorder traversal: |");
        myTree.preOrderTraversal();
        System.out.print("\n*** Postorder traversal: |");
        myTree.postOrderTraversal();
        System.out.println();
        System.out.println("Number of nodes: " + myTree.numberOfNodes());
        System.out.println("Height of the tree: " + myTree.treeHeight());
        int data2search = 18;
        System.out.println(data2search + " was found in BStree: " + myTree.search(data2search) + ". In level: " + myTree.treeHeight(data2search));
        data2search = 99;
        System.out.println(data2search + " was found in BStree: " + myTree.search(data2search) + ". In level: " + myTree.treeHeight(data2search));
    }
}
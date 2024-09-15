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
        Object pin[] = {40, 15, 25, 50, 20, 10, 70, 55, 45, 5, 18};
//        int pin[] = {20, 7, 13, 32, 41, 11, 29};
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
        System.out.println("size: " + myTree.size());
        System.out.println("Count nodes: " + myTree.countNodes());
        System.out.println("Height of the tree: " + myTree.treeHeight());
        int data2search = 18;
        System.out.println(data2search + " was found in BStree: " + myTree.search(data2search) + ". In level: " + myTree.treeHeight(data2search));
        data2search = 99;
        System.out.println(data2search + " was found in BStree: " + myTree.search(data2search) + ". In level: " + myTree.treeHeight(data2search));
        System.out.print("Array before inOrderSort() call: |");
        for (int i = 0; i < pin.length; i++) {
            System.out.print(pin[i] + "|");
        }
        System.out.println();
        System.out.print("Array after inOrderSort() call: |");
        pin = myTree.inOrderSort();
        for (int i = 0; i < pin.length; i++) {
            System.out.print(pin[i] + "|");
        }
        System.out.println();
        Object pin2[] = {40, 15, 25, 50, 20, 10, 70, 55, 45, 5, 18};
        System.out.print("Array 2 before inOrderSort() call: |");
        for (int i = 0; i < pin.length; i++) {
            System.out.print(pin2[i] + "|");
        }
        System.out.println();
        System.out.print("Array 2 after inOrderSort() call: |");
        pin2 = myTree.bsTreeSort();
        for (int i = 0; i < pin.length; i++) {
            System.out.print(pin2[i] + "|");
        }

    }
}
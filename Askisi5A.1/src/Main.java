// ΑΣΚΗΣΗ 5Α.1
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!\nToday we are testing a GBSTree with use of Generics.");
        GBSTree myTree = new GBSTree<Student>();
        System.out.println("*** Initial total nodes of this BSTree are: " + myTree.countNodes());
        System.out.println("*** Initial total leafs of this BSTree are: " + myTree.countLeafs());
        Student matrix1[] = {
                new Student(17040, "Πάνος", "Αλευρόπουλος", 47, 'Α', 5, 2),
                new Student(17065, "Νικολέτα", "Νικολάου", 27, 'Θ', 6, 1),
                new Student(17025, "Γεώργιος", "Βασιλειάδης", 19, 'Α', 3, 3),
                new Student(17050, "Ελένη", "Παπαδοπούλου", 20, 'Θ', 4.5, 2),
                new Student(17020, "Μαρία", "Γεωργιάδου", 21, 'Θ', 6.4, 0),
                new Student(17010, "Λουκάς", "Λουκίδης", 23, 'Α', 7, 1),
                new Student(17015, "Κωνσταντίνος", "Αργυρός", 20, 'Α', 6.2, 0),
                new Student(17055, "Αλεξάνδρα", "Παπανίκα", 19, 'Θ', 3.1, 1),
                new Student(17045, "Μαρία", "Αναστασιάδου", 21, 'Θ', 6.1, 2),
                new Student(17005, "Νικόλαος", "Γεωργίου", 20, 'Α', 7.7, 0),
//                new Student(2111, "Φοίβος", "Δελιβοριάς", 22, 'Α', 6, 1),
//                new Student(121212, "Απόστολος", "Ρίζος", 18, 'Α', 4.1, 3)
        };
        for (int i = 0; i < matrix1.length; i++)
            myTree.insertElement(matrix1[i]);
        GBSTree myTree1 = new GBSTree<String>();
        String matrix[] = {
                "Πάνος", "Νικολέτα", "Γεώργιος", "Ελένη", "Μαρία", "Λουκάς", "Κωνσταντίνος",
                "Αλεξάνδρα", "Μαρία", "Νικόλαος", "Φοίβος", "Απόστολος"
        };
        for (int i = 0; i < matrix.length; i++)
            myTree1.insertElement(matrix[i]);
        System.out.println("*** New elements have been inserted.");
        System.out.println("*** Total nodes of this BSTree are: " + myTree1.countNodes());
        System.out.println("*** Total leafs of this BSTree are: " + myTree1.countLeafs());
        System.out.print("*** Preorder traversal: |");
        myTree1.preOrderTraversal();
        System.out.print("\n*** Inorder traversal: |");
        myTree1.inOrderTraversal();
        System.out.print("\n*** Postorder traversal: |");
        myTree1.postOrderTraversal();
        System.out.println();
        System.out.println("Number of nodes: " + myTree1.numberOfNodes());
        System.out.println("Height of the tree: " + myTree1.treeHeight());
        System.out.print("Unordered table: ");
        for (int i = 0;  i < matrix.length; i++)
            System.out.print("|" + matrix[i]);
        System.out.println();
        System.out.print("inOrderSort to table: ");
        Object[] sortedMatrix;
        sortedMatrix = myTree1.inOrderSort();
        for (int i = 0;  i < sortedMatrix.length; i++)
            System.out.print("|" + sortedMatrix[i]);
        System.out.println();
    }
}
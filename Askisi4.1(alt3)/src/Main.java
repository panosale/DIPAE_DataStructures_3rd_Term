// Άσκηση 4.1 Έλεγχος παρενθέσεων
// Παράδειγμα Στοίβας με υλοποίηση Συνδεδεμένης Λίστας σε Java
public class Main {
    public static boolean simpleBracketsCheck(String expression) {
        LinkedStack3 checkStack = new LinkedStack3();
        char charToCheck;
        for (int i = 0; i < expression.length(); i++) {
            charToCheck = expression.charAt(i);
            if (charToCheck == '(')
                checkStack.pushStackElement('(');
            if (charToCheck == ')') {
                if (checkStack.stackIsEmpty()) {
                    System.out.println("Βρέθηκε λάθος παρένθεση στη θέση: " + (i + 1));
                    return false;
                }
                else
                    checkStack.popStackElement();
            }
        }
        if (checkStack.stackIsEmpty()) {
            System.out.println("Δεν βρέθηκε λάθος παρένθεση στην πρόταση: " + expression);
            return true;
        }
        else {
            System.out.println("Βρέθηκε λάθος παρένθεση στη θέση: " + expression.length());
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("***** Άσκηση 4.1. Έλεγχος παρενθέσεων με τη χρήση Στοίβας με υλοποίηση Συνδεδεμένης Λίστας *****");
        String sentenceToCheck1 = "(x + y) + 3(x - y) - 2(3x + y)";
        simpleBracketsCheck(sentenceToCheck1);
        sentenceToCheck1 = "(x + y)) + 3(x - y) - 2(3x + y)";
        simpleBracketsCheck(sentenceToCheck1);
    }
}
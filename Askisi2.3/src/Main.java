// Άσκηση 2.3. Έλεγχος παρενθέσεων
// Παράδειγμα στοίβας σε Java
public class Main {
    public static boolean simpleBraucketsCheck(String expression) {
        ArrayStack checkStack = new ArrayStack(expression.length());
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
        System.out.println("***** Άσκηση 2.3. Έλεγχος παρενθέσεων *****");
        String sentenceToCheck1 = "(x + y) + 3(x - y) - 2(3x + y)";
        simpleBraucketsCheck(sentenceToCheck1);
        sentenceToCheck1 = "(x + y)) + 3(x - y) - 2(3x + y)";
        simpleBraucketsCheck(sentenceToCheck1);
    }
}
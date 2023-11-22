// Άσκηση 2.4. Έλεγχος παρενθέσεων, αγκιλών και αγκίστρων
// Παράδειγμα στοίβας σε Java
public class Main {
    public static boolean simpleBracketsCheck(String expression) {
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
    public static boolean allBracketsCheck(String expression) {
        ArrayStack checkStack = new ArrayStack(expression.length());
        char charToCheck;
        for (int i = 0; i < expression.length(); i++) {
            charToCheck = expression.charAt(i);
            switch (charToCheck) {
                case '(':
                    checkStack.pushStackElement('(');
                    break;
                case '[':
                    checkStack.pushStackElement('[');
                    break;
                case '{':
                    checkStack.pushStackElement('{');
                    break;
                case ')':
                    if (checkStack.stackIsEmpty() || !(checkStack.popStackElement().equals('('))) {
                        System.out.println("Βρέθηκε λάθος παρένθεση στη θέση: " + (i + 1));
                        return false;
                    }
                    break;
                case ']':
                    if (checkStack.stackIsEmpty() || !(checkStack.popStackElement().equals('['))) {
                        System.out.println("Βρέθηκε λάθος αγκίλη στη θέση: " + (i + 1));
                        return false;
                    }
                    break;
                case '}':
                    if (checkStack.stackIsEmpty() || !(checkStack.popStackElement().equals('{'))) {
                        System.out.println("Βρέθηκε λάθος άγκιστρο στη θέση: " + (i + 1));
                        return false;
                    }
                    break;
                default:
//                    System.out.println("Ο χαρακτήρας " + charToCheck + " δεν χρησιμοποιείται.");
                    break;
            }
        }
        if (checkStack.stackIsEmpty()) {
//            System.out.println("Δεν βρέθηκε λάθος παρένθεση, αγκίλη ή άγκιστρο στην πρόταση: " + expression);
            System.out.println("Δεν βρέθηκε λάθος παρένθεση, αγκίλη ή άγκιστρο σε αυτή την πρόταση.");
            return true;
        }
        else {

            System.out.println("Βρέθηκε λάθος σύμβολο στη θέση: " + expression.length());
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("***** Άσκηση 2.3. Έλεγχος παρενθέσεων *****");
        String sentenceToCheck1 = "(x + y) + 3[x - y] - 2{3x + y}";
        System.out.println("*** Έλεγχος παρενθέσεων. ");
        simpleBracketsCheck(sentenceToCheck1);
        sentenceToCheck1 = "(x + y)] + 3(x - y) - 2(3x + y)";
        simpleBracketsCheck(sentenceToCheck1);
        System.out.println("\n*** Έλεγχος παρενθέσεων/αγκιλών & αγκίστρων. ");
        sentenceToCheck1 = "(x + y) + 3[x - y] - 2{3x + y}";
        System.out.println("Θα ελεγχθεί η πρόταση:" + sentenceToCheck1);
        allBracketsCheck(sentenceToCheck1);
        sentenceToCheck1 = "{x + y} + 3(x - y)} - 2(3x + y)";
        System.out.println("\nΘα ελεγχθεί η πρόταση:" + sentenceToCheck1);
        allBracketsCheck(sentenceToCheck1);
    }
}
import java.util.Random;

// Δομές δεδομένων - Άσκηση 2.1 - Ζάρια
public class Main {
    public static void main(String[] args) {
        final int MAX_DICE_ROLLS = 30000;
        final int MAX_DIE_RESULT = 11;
        Die die1 = new Die();
        Die die2 = new Die();
        int[] diceRollsArray = new int[MAX_DIE_RESULT];
//        for (int i = 0; i < MAX_DIE_RESULT; i++) // Αρχικοποίηση πίνακα αποτελεσμάτων. Πιθανόν δεν χρειάζεται
//            diceRollsArray[i] = 0;
        for (int i = 0; i < MAX_DICE_ROLLS; i++) // Γέμισμα πίνακα αποτελεσμάτων
            diceRollsArray[(die1.rollDie() + die2.rollDie()) - 2]++; // Αύξηση κατά 1 της θέσης που ταιριάζει με το αποτέλεσμα της ρίψης.
                // Η θέση είναι +2 επειδή η αρίθμηση των θέσεων των πινάκων ξεκινάει απ' το 0.
        for (int i = 0; i < MAX_DIE_RESULT; i++) //  Εμφάνιση αποτελεσμάτων
            System.out.println("Τα ζάρια έφεραν " + (i + 2) + " [" + diceRollsArray[i] + "] φορές.");
    }
}
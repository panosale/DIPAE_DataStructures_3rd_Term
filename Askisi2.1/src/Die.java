import java.util.Random;

public class Die {
    public int rollDie() {
        int min = 1;
        int max = 6;
        return (min + (int)(Math.random() * ((max - min) + 1)));
    }
}

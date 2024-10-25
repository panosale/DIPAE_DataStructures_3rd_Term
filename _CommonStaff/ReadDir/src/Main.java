import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!\nToday we are testing the File class.");
        File file = null;
        String[] paths;
        String fpaths;
        try {
            // Δημιουργία νέου αντικειμένου file
            file = new File("c:/temp");
            paths = file.list();
            fpaths = file.getPath();
            // Για κάθε όνομα μέσα στον πίνακα paths
            for (String path: paths) {
                // Τυπώνεται το όνομα του αρχείου και του καταλόγου
                System.out.print(fpaths + "\\" + path);
                System.out.println();
            }
        } catch (Exception error) {
            // Αν εμφανιστεί σφάλμα
            System.out.println(error);
        }
    }
}
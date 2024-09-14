// Άσκηση 1.1
public class Student {
    private int aM;
    private String onoma;
    private String epitheto;
    private double hlikia;
    private char fylo;
    private double vathmos;
    private int arithmosApousion;

    public Student() {
        // Default constructor
    }
    public Student(int newAM, String newOnoma, String newEpitheto, double newHlikia, char newFylo) {
        // Semi constructor
        this(newAM, newOnoma, newEpitheto, newHlikia, newFylo, 0.0, 0);
//        this.aM = newAM;
//        this.onoma = newOnoma;
//        this.epitheto = newEpitheto;
//        this.hlikia = newHlikia;
//        this.fylo = newFylo;
//        this.arithmosApousion = 0;
//        this.vathmos = 0;
    }
    public Student(int newAM, String newOnoma, String newEpitheto, double newHlikia, char newFylo, double newVathmos, int newArithmosApousion) {
        // Full constructor
        this.aM = newAM;
        this.onoma = newOnoma;
        this.epitheto = newEpitheto;
        this.hlikia = newHlikia;
        this.fylo = newFylo;
        this.vathmos = newVathmos;
        this.arithmosApousion = newArithmosApousion;
    }
    // Setters-Getters
    public void setAM(int aM) {
        this.aM = aM;
    }
    public int getAM() {
        return this.aM;
    }
    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }
    public String getOnoma() {
        return this.onoma;
    }
    public void setEpitheto(String epitheto) {
        this.epitheto = epitheto;
    }
    public String getEpitheto() {
        return this.epitheto;
    }
    public void setHlikia(double hlikia) {
        this.hlikia = hlikia;
    }
    public double getHlikia() {
        return this.hlikia;
    }
    public void setFylo(char fylo) {
        this.fylo = fylo;
    }
    public char getFylo() {
        return this.fylo;
    }
    public void setVathmos(double vathmos) {
        this.vathmos = vathmos;
    }
    public double getVathmos() {
        return this.vathmos;
    }
    public void setArithmosApousion(int arithmosApousion) {
        this.arithmosApousion = arithmosApousion;
    }
    public int getArithmosApousion() {
        return this.arithmosApousion;
    }
    public String toString() {
        return "Αριθμός μητρώου: " + this.aM + "\nΟνοματεπώνυμο: " + this.epitheto + ", " + this.onoma + "\nΦύλο: " + this.fylo + "\nΗλικία: " + this.hlikia
                + "\nΑριθμός απουσιών: " + this.arithmosApousion + "\nΒαθμός: " + this.vathmos;
    }
}

// Άσκηση 1.1
public class Student {
    private int aM;
    private String firstName;
    private String lastName;
    private double hlikia;
    private char fylo;
    private double vathmos;
    private int arithmosApousion;

    public Student() {
        // Default constructor
    }
    public Student(int newAM, String newFirstName, String newLastName, double newHlikia, char newFylo) {
        // Semi constructor
        this.aM = newAM;
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.hlikia = newHlikia;
        this.fylo = newFylo;
        this.arithmosApousion = 0;
        this.vathmos = 0;
    }
    public Student(int newAM, String newFirstName, String newLastName, double newHlikia, char newFylo, double newVathmos, int newArithmosApousion) {
        // Full constructor
        this.aM = newAM;
        this.firstName = newFirstName;
        this.lastName = newLastName;
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
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return this.lastName;
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
        return "Αριθμός μητρώου: " + this.aM + "\nΟνοματεπώνυμο: " + this.lastName + ", " + this.firstName + "\nΦύλο: " + this.fylo + "\nΗλικία: " + this.hlikia
                + "\nΑριθμός απουσιών: " + this.arithmosApousion + "\nΒαθμός: " + this.vathmos;
    }
}

public abstract class Cars {
    private String carPlate;
    private double carLength;
    public Cars() {
        // Default constructor
    }
    public Cars(String newCarPlate) {
        // Semi constructor
        this (newCarPlate, 0.0);
    }
    public Cars(String newCarPlate, double newCarLength) {
        // Full constructor
        this.carPlate = newCarPlate;
        this.carLength = newCarLength;
    }
    // Getters - Setters
    public String getCarPlate() {
        return this.carPlate;
    }
    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }
    public double getCarLength() {
        return this.carLength;
    }
    public void setCarLength(double carLength) {
        this.carLength = carLength;
    }
}

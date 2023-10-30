// Άσκηση 1.2
public class LaboratoryCourse {
    private String courseName;
    private int labsNumber = 5;
    public LaboratoryCourse() {
        // Default constructor
    }  
    public LaboratoryCourse(String newCourseName, int newLabsNumber) {
        // Full constructor
        this.CourseName = newCourseName;
        this.labsNumber = newLabsNumber;
    }
  
    // Setters-Getters
    public void setCourseName(String newCourseName) {
        this.courseName = newCourseName;
    }
    public String getCourseName() {
        return this.courseName;
    }

    public void setLabsNumber(int newLabsNumber) {
        this.labsNumber = newLabsNumber;
    }

    public int getLabsNumber() {
        return this.labsNumber;
    }
    
}

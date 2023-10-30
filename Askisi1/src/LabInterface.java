// Άσκηση 1.1
public interface LabInterface {
    public boolean insertStudent(Student std);
    public boolean deleteStudent(Student std);
    public Student searchStudent(int am);
    public void parousiologio();
    public int succededStudents();
    public int failedStudents();
    public double averageGrade();
}

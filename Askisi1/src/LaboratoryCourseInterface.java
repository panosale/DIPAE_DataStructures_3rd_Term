public interface LaboratoryCourseInterface {
    public void printTotalNumberOfStudents();
    // Εκτυπώνει το συνολικό πλήθος των φοιτητών που παρακολουθούν το εργαστηριακό μάθημα
    public void printSuccessStatus();
    // Εκτυπώνει το πλήθος τον φοιτητών που πέτυχαν-απέτυχαν στο μάθημα ανά εργαστήριο και συνολικά για το εργαστηριακό μάθημα
    public void printAverages();
    // Εκτυπώνει το μέσο όρο του βαθμού των φοιτητών ανά εργαστήριο και το συνολικό μέσο όρο για το μάθημα
    public void printSuccessStatistics();
    // Εκτυπώνει τα ποσοστά επιτυχίας και αποτυχίας ανά εργαστήριο και συνολικά για το μάθημα
}

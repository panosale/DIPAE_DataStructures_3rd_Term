// Άσκηση 2.5. Η Ουρά χειρίζεται μόνο αντικείμενα τύπου Objet (πιο γενική χρήση)
// Παράδειγμα ουράς σε Java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!\nToday we are testing Queue Data Structure with Java");
        Object tmpObj = new Object();
        ArrayQueue testQueue = new ArrayQueue(3);
        System.out.println("***** Maximum Queue size is: " + testQueue.getMaxQueueCapacity());
        System.out.println("Current Queue size is: " + testQueue.getQueueSize());
        System.out.println("Adding a new element in last position of Queue.");
        testQueue.enqueueElement(tmpObj);
        System.out.println("Current Queue size is: " + testQueue.getQueueSize());
        System.out.println("Adding a new element in last position of Queue.");
        testQueue.enqueueElement(tmpObj);
        System.out.println("Current Queue size is: " + testQueue.getQueueSize());
        System.out.println("Adding a new element in last position of Queue.");
        testQueue.enqueueElement(tmpObj);
        System.out.println("Current Queue size is: " + testQueue.getQueueSize());
        System.out.println("Removing an element from the first position of Queue.");
        testQueue.dequeueElement();
        System.out.println("Current Queue size is: " + testQueue.getQueueSize());
    }
}
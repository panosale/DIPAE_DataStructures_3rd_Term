public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!\nToday we are testing Queue Data Structure with Java");
        Object tmpObj = new Object();
        ArrayQueue testQueue = new ArrayQueue(3);
        System.out.println("***** Maximum Queue size is: " + testQueue.getMaxQueueCapacity());
        System.out.println("Current Queue size is: " + testQueue.size());
        System.out.println("Adding a new element in last position of Queue.");
        testQueue.enqueue(tmpObj);
        System.out.println("Current Queue size is: " + testQueue.size());
        System.out.println("Adding a new element in last position of Queue.");
        testQueue.enqueue(tmpObj);
        System.out.println("Current Queue size is: " + testQueue.size());
        System.out.println("Adding a new element in last position of Queue.");
        testQueue.enqueue(tmpObj);
        System.out.println("Current Queue size is: " + testQueue.size());
        System.out.println("Removing an element from the first position of Queue.");
        testQueue.dequeue();
        System.out.println("Current Queue size is: " + testQueue.size());
    }
}
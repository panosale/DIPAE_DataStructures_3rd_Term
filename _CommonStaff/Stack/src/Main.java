// Παράδειγμα στοίβας σε Java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!\nToday we are testing Stack Data Structure with Java");
        Object tmpObj = new Object();
        ArrayStack testStack = new ArrayStack(3);
        System.out.println("***** Maximum Stack size is: " + testStack.getMaxStackCapacity());
        System.out.println("Current Stack size is: " + testStack.size());
        System.out.println("Pushing a new element in Stack.");
        testStack.push(tmpObj);
        System.out.println("Current Stack size is: " + testStack.size());
        System.out.println("Pushing a new element in Stack.");
        testStack.push(tmpObj);
        System.out.println("Current Stack size is: " + testStack.size());
        System.out.println("Pushing a new element in Stack.");
        testStack.push(tmpObj);
        System.out.println("Current Stack size is: " + testStack.size());
        System.out.println("Popping element from Stack.");
        tmpObj = testStack.pop();
        System.out.println("Current Stack size is: " + testStack.size());
        System.out.println("Pushing a new element in Stack.");
        testStack.push(tmpObj);
        System.out.println("Current Stack size is: " + testStack.size());
//        System.out.println("Popping element from stack.");
//        tmpObj = testStack.pop();
//        System.out.println("Current stack size is: " + testStack.getStackSize());
        }
    }

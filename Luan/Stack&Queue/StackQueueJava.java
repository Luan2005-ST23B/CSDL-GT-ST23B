import java.util.Queue;
import java.util.LinkedList;

public class StackQueueJava {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();

        // Enqueue elements using add()
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);

        // Print the elements of the queue
        for (Integer integer : myQueue) {
            System.out.println(integer);
        }

        System.out.println("Peek: " +myQueue.peek());
        System.out.println("Remove: " +myQueue.remove());

        System.out.println("Peek: " +myQueue.peek());
        System.out.println("Remove: " +myQueue.remove());

        System.out.println("Peek: " +myQueue.peek());
        System.out.println("Remove: " +myQueue.remove());

        System.out.println("isEmpty: " +myQueue.isEmpty());
    }
}

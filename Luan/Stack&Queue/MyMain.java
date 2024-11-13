import java.util.Scanner;
public class MyMain {
    public static void testArrayQueue(){
        // Create a queue with a fixed size
        MyArrayQueue queue = new MyArrayQueue(5);

        // Test push method
        System.out.println("Pushing 1, 2, 3 into the queue:");
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.show(); // Expected output: 1 2 3

        // Test pop method
        System.out.println("\nPopping from the queue:");
        System.out.println(queue.pop()); // Expected output: 1
        queue.show();                    // Expected output: 2 3

        // Push more elements
        System.out.println("\nPushing 4 and 5 into the queue:");
        queue.push(4);
        queue.push(5);
        queue.show();                    // Expected output: 2 3 4 5

        // Test count method
        System.out.println("\nCount of elements in the queue: " + queue.count()); // Expected output: 4

        // Test push on full queue
        System.out.println("\nTrying to push 6 (queue should be full):");
        if (!queue.push(6)) {
            System.out.println("Queue is full!");
        }
        queue.show();                    // Expected output: 2 3 4 5

        // Test pop until empty
        System.out.println("\nPopping all elements:");
        while (!queue.isEmpty()) {
            System.out.println("Popped: " + queue.pop());
            queue.show();
        }

        // Test isEmpty and count method
        System.out.println("\nIs queue empty? " + queue.isEmpty());  // Expected output: true
        System.out.println("Count of elements in the queue: " + queue.count()); // Expected output: 0
    }

    public static void testLLQueue(){
        // Create a queue with a fixed size
        MyLinkedListQueue queue = new MyLinkedListQueue();
        // test push
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.show();

        // test pop
        System.out.println(queue.pop());
        queue.show();
        System.out.println(queue.pop());
        queue.show();
        System.out.println(queue.pop());
        queue.show();

        // test isFull
        System.out.println(queue.isFull());

        // test isEmpty
        System.out.println(queue.isEmpty());
        queue.show();
    }
    public static void testArrayStack(){
        // Create a stack with a fixed size
        MyArrayStack stack = new MyArrayStack(5);

        // Test push method
        System.out.println("Pushing 1, 2, 3 into the stack:");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.show(); // Expected output: 1 2 3

        // Test pop method
        System.out.println("\nPopping from the stack:");
        System.out.println("Popped: " + stack.pop()); // Expected output: 3
        stack.show(); // Expected output: 1 2

        // Push more elements
        System.out.println("\nPushing 4 and 5 into the stack:");
        stack.push(4);
        stack.push(5);
        stack.show(); // Expected output: 1 2 4 5

        // Test isFull method
        System.out.println("\nTrying to push 6 (stack should be full):");
        if (!stack.push(6)) {
            System.out.println("Stack is full!");
        }
        stack.show(); // Expected output: 1 2 4 5

        // Test pop until empty
        System.out.println("\nPopping all elements:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
            stack.show();
        }

        // Test isEmpty method
        System.out.println("\nIs stack empty? " + stack.isEmpty()); // Expected output: true
    }

    public static void testLLStack() {
        // Create a queue with a fixed size
        MyLinkedListStack stack = new MyLinkedListStack();

        // Test push
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.show(); // Show current stack

        // Test pop
        System.out.println(stack.pop()); // Pop and print the top element
        stack.show();
        System.out.println(stack.pop());
        stack.show();
        System.out.println(stack.pop());
        stack.show();

        // Test isFull (if applicable)
        System.out.println(stack.isFull());

        // Test isEmpty
        System.out.println(stack.isEmpty());
        stack.show();
    }

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("Menu:");
                System.out.println("1. Test Array Queue");
                System.out.println("2. Test Linked List Queue");
                System.out.println("3. Test Array Stack");
                System.out.println("4. Test Linked List Stack");
                System.out.println("5. Exit!");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        testArrayQueue();
                        break;
                    case 2:
                        testLLQueue();
                        break;
                    case 3:
                        testArrayStack();
                        break;
                    case 4:
                        testLLStack();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice, please try again.");
                }
                System.out.println();
            } while (choice != 0);

            scanner.close();
        }
    }



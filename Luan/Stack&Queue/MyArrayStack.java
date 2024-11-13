//public class MyArrayStack implements IStackQueue{
//    private int[] array;
//    private int SIZE;
//    private int topIndex;
//
//    MyArrayStack(int size) {
//        SIZE = size;
//        array = new int[SIZE];
//        topIndex = -1; // stack is empty
//    }
//
//    public boolean push(int value) {
//        if (!isFull()) {
//            array[topIndex++] = value;
//            return true;
//        }
//        return false;
//    }
//
//    public int pop() {
//        if (!isEmpty()) {
//            int value = array[topIndex];
//            topIndex--;
//            return value;
//        }
//        return -1;
//    }
//
//    public boolean isFull() {
//        return topIndex == SIZE - 1;
//    }
//
//    public boolean isEmpty() {
//        return topIndex < 0;
//    }
//
//    public void show() {
//        if (isEmpty()) {
//            System.out.println("Stack is empty");
//        } else {
//            for (int i = 0; i <= topIndex; i++) {
//                System.out.print(array[i] + " ");
//            }
//            System.out.println();
//
//        }
//    }
//}
public class MyArrayStack implements IStackQueue{
    private int[] stack;
    private int top;
    private int capacity;

    // Hàm khởi tạo
    public MyArrayStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1; // Ngăn xếp đang trống
    }

    // Phương thức push
    public boolean push(int value) {
        if (isFull()) {
            return false; // Ngăn xếp đã đầy
        }
        stack[++top] = value; // Tăng top và thêm giá trị
        return true;
    }

    // Phương thức pop
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Ngăn xếp đang trống"); // Xử lý ngăn xếp trống
        }
        return stack[top--]; // Trả về giá trị ở top và giảm top
    }

    // Kiểm tra ngăn xếp có đầy không
    public boolean isFull() {
        return top == capacity - 1; // Kiểm tra xem top có ở chỉ số cuối cùng không
    }

    // Kiểm tra ngăn xếp có trống không
    public boolean isEmpty() {
        return top == -1; // Kiểm tra xem top có bằng -1 không
    }

    // Phương thức show
    public void show() {
        if (isEmpty()) {
            System.out.println("Ngăn xếp đang trống");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

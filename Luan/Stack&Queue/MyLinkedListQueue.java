public class MyLinkedListQueue implements IStackQueue{
    public class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    Node headNode;
    Node tailNode;
    MyLinkedListQueue(){
        headNode = tailNode = null;
    }

    public boolean push(int value) {
        Node newNode = new Node(value);
        if (isFull()) {
            return false; // Hàng đợi đã đầy
        }
        if (isEmpty()) {
            headNode = tailNode = newNode;
        } else {
            tailNode.next = newNode;
            tailNode = newNode;
        }
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            return -1; // Hàng đợi rỗng, trả về -1
        }

        int value = headNode.value;
        if (headNode == tailNode) { // Trường hợp chỉ có 1 nút
            headNode = tailNode = null;
        } else {
            headNode = headNode.next;
        }

        return value;
    }

    public boolean isFull() {
        return false;
    }

    public boolean isEmpty() {
        return (headNode == null && tailNode == null);
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
        }
        Node curNode = headNode;
        while (curNode != null){
            System.out.println(curNode.value + " ");
            curNode = curNode.next;
        }
        System.out.println();
    }
}

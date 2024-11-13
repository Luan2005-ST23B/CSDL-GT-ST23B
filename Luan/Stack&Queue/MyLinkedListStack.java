import  java.util.ArrayList;
public class MyLinkedListStack implements IStackQueue{
    private class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    Node topNode;
    MyLinkedListStack() {
        topNode = null;
    }

    public boolean push(int value) {
        if (isFull()) {
            return false; // Stack đã đầy
        }

        Node newNode = new Node(value);
        newNode.next = topNode;
        topNode = newNode;

        return true;
    }

    public int pop() {
        if (isEmpty()) {
            return -1; // Stack rỗng, trả về -1
        }

        int value = topNode.value;
        topNode = topNode.next;
        return value;
    }

    public boolean isFull() {
        return false; // Khi nào đầy bộ nhớ thì full, nhưng mà linked list thì làm sao full được nên luôn return false
    }

    public boolean isEmpty() {
        return topNode == null;
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            Node temp = topNode;
            ArrayList<Integer> tempList = new ArrayList<>();
            while (temp != null) {
                tempList.add(temp.value);
                temp = temp.next;
            }
            for(int i = tempList.size() -1; i>=0; i--){
                System.out.println(tempList.get(i) + " ");
            }
            System.out.println();
        }
    }
}

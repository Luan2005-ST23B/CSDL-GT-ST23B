public class LinkedList<T> {
    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    public void traverse(){
        Node<T> tmp = head;
        while (tmp != null){
            System.out.println(tmp.getData());
            // chuen den ptu tiep theo
            tmp = tmp.getNext();
        }
    }

    public void AddToHead(T item){
        // buoc 1
        // Node<T> newNode = new Node<>(item, this.head);
        Node<T> newNode = new Node<>();
        newNode.setData(item);
        newNode.setNext(this.head);

        // buoc 2
        this.head = newNode;
    }

    public void AddToTail(T item){
        if(head == null){
            AddToHead(item);
        }
        else {
            Node<T> newNode = new Node<>(item, null);
            Node<T> tmp = head;
            while (tmp.getNext() != null){
                tmp = tmp.getNext();
            }
            tmp.setNext(newNode);
        }
    }

    public void AddToMiddle1(T key, T toInsert){
        // Buoc 1
        Node<T> newNode = new Node<>();
        newNode.setData(toInsert);

        // Buoc 2 Tim vi tri cua key
        Node<T> tmp = head;
        while (tmp != null && ! tmp.getData().equals(key)){
            tmp = tmp.getNext();
        }
        // tim duoc node chua key hoac la di den cuoi ll

        // them vao khi tmp <> null
        if(tmp != null){
            //2
            newNode.setNext(tmp.getNext());
            //3
            tmp.setNext(newNode);

        }
    }
    public void AddToMiddle2(T key, T toInsert){
        // Buoc 2 Tim vi tri cua key
        Node<T> tmp = head;
        while (tmp != null && ! tmp.getData().equals(key)){
            tmp = tmp.getNext();
        }
        // tim duoc node chua key hoac la di den cuoi ll

        // them vao khi tmp <> null
        if(tmp != null){
//            1
//            Node<T> newNode = new Node<>();
//            newNode.setData(toInsert);
//            2
//            newNode.setNext(tmp.getNext());
              // 1+2
              Node<T> newNode = new Node<>(toInsert, tmp.getNext());
//            3
            tmp.setNext(newNode);

        }
    }

    public void Remove(T key){
        if (head == null){
            throw new RuntimeException("Can not delete");
        }

        // xoa o vi tri dau
        if (head.getData().equals(key)){
            this.head = head.getNext();
            return;
        }

        // tao bien tam
        Node<T> prev = null;
        Node<T> curr = head;
        while (curr != null && !curr.getData().equals(key)){
            prev = curr;
            curr = curr.getNext();
        }

        if(curr == null)
            throw new RuntimeException("Cannot Delete");

        prev.setNext(curr.getNext());
    }

    public boolean isEmpty(){
//        if(head == null )
//            return true;
//        else
//            return false;
        return head == null;
    }

    public int size(){
        int size = 0;

        Node<T> tmp = head;
        while (tmp != null){
            // dem
            size++;
            // chuen den ptu tiep theo
            tmp = tmp.getNext();
        }
        return size;
    }

    public boolean findItem(T item){
        Node<T> tmp = head;
        while (tmp != null){
            if(tmp.getData().equals(item)){
                return true;
            }
            // chuen den ptu tiep theo
            tmp = tmp.getNext();
        }
        return false;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }
}
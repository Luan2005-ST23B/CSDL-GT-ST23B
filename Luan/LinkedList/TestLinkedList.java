public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.AddToHead("Ta");
        ll.AddToHead("Quang");
        ll.AddToHead("Khanh");
        ll.traverse();
        System.out.println("------------");

        ll.AddToTail("Dep zai");
        ll.traverse();
        System.out.println("------------");

        ll.AddToMiddle1("Khanh", "Tiktok");
        ll.traverse();
        System.out.println("------------");

        ll.Remove("Ta");
        ll.traverse();
        System.out.println("------------");

        System.out.println("Check empty "+ ll.isEmpty());
        System.out.println("Size "+ ll.size());
    }
}

public class Prob8 {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);

        while (head.next != null)
            head = head.next;

        System.out.println(head.data);
    }
}
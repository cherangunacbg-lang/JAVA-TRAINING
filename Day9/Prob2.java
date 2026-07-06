public class Prob2 {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    public static void main(String[] args) {
        Node head = new Node(20);
        Node n = new Node(10);
        n.next = head;
        head = n;

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
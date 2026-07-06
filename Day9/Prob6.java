public class Prob6 {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);

        head = head.next;

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
public class Prob4 {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);

        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }

        System.out.println(count);
    }
}
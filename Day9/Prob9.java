public class Prob9 {
   public Prob9() {
   }

   public static void main(String[] var0) {
      Node var1 = new Node(10);
      var1.next = new Node(20);
      var1.next.next = new Node(30);

      for(Node var2 = var1; var2 != null; var2 = var2.next) {
         System.out.print(var2.data + " ");
      }

   }

   static class Node {
      int data;
      Node next;

      Node(int var1) {
         this.data = var1;
         this.next = null;
      }
   }
}

public class Prob5 {
    public static void main(String[] args) {
        int n = 15;
        int i = 1;

        n = n & ~(1 << i);

        System.out.println(n);
    }
}

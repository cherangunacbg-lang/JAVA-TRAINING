public class Prob4 {
    public static void main(String[] args) {
        int n = 10;
        int i = 2;

        n = n | (1 << i);

        System.out.println(n);
    }
}

public class Prob3 {
    public static void main(String[] args) {
        int n = 10;
        int i = 1;

        if ((n & (1 << i)) != 0)
            System.out.println("Bit is Set");
        else
            System.out.println("Bit is Not Set");
    }
}
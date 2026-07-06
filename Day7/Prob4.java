public class Prob4 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 7, 8};
        int k = 2;

        int sum = 0;

        for (int i = 0; i < k; i++)
            sum += arr[i];

        System.out.println(sum);
    }
}
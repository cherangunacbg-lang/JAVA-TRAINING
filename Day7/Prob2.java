public class Prob2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4};
        int k = 3;

        int sum = 0;

        for (int i = 0; i < k; i++)
            sum += arr[i];

        System.out.println((double) sum / k);

        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            System.out.println((double) sum / k);
        }
    }
}
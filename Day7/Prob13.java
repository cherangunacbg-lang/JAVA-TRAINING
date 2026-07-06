public class Prob13 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int sum = 0;

        for (int i = 0; i < k; i++)
            sum += arr[i];

        int max = sum;
        int index = 0;

        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];

            if (sum > max) {
                max = sum;
                index = i - k + 1;
            }
        }

        System.out.println("Starting Index = " + index);
    }
}
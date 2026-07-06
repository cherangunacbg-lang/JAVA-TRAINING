public class Prob11 {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 5, 1};
        int k = 2;

        int sum = arr[0] + arr[1];
        int min = sum;

        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            min = Math.min(min, sum);
        }

        System.out.println(min);
    }
}
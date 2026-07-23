public class Prob6 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4};
        int k = 3;

        for (int i = 0; i <= arr.length - k; i++) {
            int max = arr[i];

            for (int j = i; j < i + k; j++)
                max = Math.max(max, arr[j]);

            System.out.println(max);
        }
    }
}
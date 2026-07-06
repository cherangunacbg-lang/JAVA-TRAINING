public class Prob7 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 6};
        int k = 2;

        for (int i = 0; i <= arr.length - k; i++) {
            int min = arr[i];

            for (int j = i; j < i + k; j++)
                min = Math.min(min, arr[j]);

            System.out.println(min);
        }
    }
}
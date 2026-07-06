public class Prob8 {
    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4, -5};
        int k = 2;

        for (int i = 0; i <= arr.length - k; i++) {
            int count = 0;

            for (int j = i; j < i + k; j++) {
                if (arr[j] < 0)
                    count++;
            }

            System.out.println(count);
        }
    }
}
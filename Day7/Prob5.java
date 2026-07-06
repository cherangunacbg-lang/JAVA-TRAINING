public class Prob5 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int k = 2;
        int x = 10;

        int sum = 0;
        int count = 0;

        for (int i = 0; i < k; i++)
            sum += arr[i];

        if (sum > x)
            count++;

        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];

            if (sum > x)
                count++;
        }

        System.out.println(count);
    }
}
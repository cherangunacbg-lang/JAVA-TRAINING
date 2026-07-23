public class Prob12 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        int sum = arr[0] + arr[1];
        int count = 0;

        if (sum % 2 == 0)
            count++;

        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];

            if (sum % 2 == 0)
                count++;
        }

        System.out.println(count);
    }
}
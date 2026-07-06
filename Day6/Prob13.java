public class Prob13 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 7;

        int left = 0, right = arr.length - 1;
        int count = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                count++;
                left++;
                right--;
            } else if (sum < target)
                left++;
            else
                right--;
        }

        System.out.println(count);
    }
}
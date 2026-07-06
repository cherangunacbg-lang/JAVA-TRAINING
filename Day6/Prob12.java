public class Prob12 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int target = 9;

        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println(left + " " + right);
                break;
            } else if (sum < target)
                left++;
            else
                right--;
        }
    }
}
public class Prob4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 7;

        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println(arr[left] + " " + arr[right]);
                break;
            } else if (sum < target)
                left++;
            else
                right--;
        }
    }
}
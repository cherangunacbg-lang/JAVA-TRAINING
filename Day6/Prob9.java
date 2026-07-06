public class Prob9 {
    public static void main(String[] args) {
        int[] h = {1,8,6,2,5,4,8,3,7};

        int left = 0, right = h.length - 1;
        int max = 0;

        while (left < right) {
            int area = Math.min(h[left], h[right]) * (right - left);

            if (area > max)
                max = area;

            if (h[left] < h[right])
                left++;
            else
                right--;
        }

        System.out.println(max);
    }
}
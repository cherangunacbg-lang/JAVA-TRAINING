public class Prob7 {
    public static void main(String[] args) {
        int[] a = {5,8,2};
        int max = a[0];
        for(int i : a)
            if(i > max) max = i;
        System.out.println(max);
    }
}

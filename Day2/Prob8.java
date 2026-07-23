public class Prob8 {
        public static void main(String[] args) {
        int[] a = {5,8,2};
        int min = a[0];
        for(int i : a)
            if(i < min) min = i;
        System.out.println(min);
    }
    
}

public class Prob8 {
    public static void main(String[] args) {
        int[] arr={2,-1,3,-2,5};

        int sum=0,max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>max)
                max=sum;
        }

        System.out.println(max);
    }
}
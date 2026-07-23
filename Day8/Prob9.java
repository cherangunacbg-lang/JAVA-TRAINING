public class Prob9 {
    public static void main(String[] args) {
        int[] arr={2,-5,3,-1,4};

        int sum=0,min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum<min)
                min=sum;
        }

        System.out.println(min);
    }
}
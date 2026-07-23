public class Prob6 {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        int k=4;

        int[] prefix=new int[arr.length];
        prefix[0]=arr[0];

        for(int i=1;i<arr.length;i++)
            prefix[i]=prefix[i-1]+arr[i];

        System.out.println((double)prefix[k-1]/k);
    }
}
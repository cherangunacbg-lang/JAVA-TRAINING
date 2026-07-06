public class Prob13 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=6;

        int sum=0;
        boolean found=false;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(sum==target){
                found=true;
                break;
            }
        }

        System.out.println(found);
    }
}
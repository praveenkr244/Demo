package tests;

public class SubArraySumZero {
    public static void sunArraySum(int[] arr){
        //start
        for(int i=0;i<arr.length;i++){
            //end
            int sum=0;
            for(int j=i;j<arr.length;j++){
             sum=sum+arr[j];
             if(sum==0){
                 System.out.println("start index"+i + " end index"+ j);
             }
            }
        }
    }
    public static void main(String[] args) {
       int[] arr={6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        sunArraySum(arr);
    }
}

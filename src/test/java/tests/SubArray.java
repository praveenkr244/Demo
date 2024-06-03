package tests;

public class SubArray {

    //arr[] = {1, 4, 20, 3, 10, 5}

    public void sumArray(int arr[],int sum){

        /*for(int i=0;i<arr.length;i++){
            int csum=arr[i];
            if(csum==sum){
                System.out.println("sum at index "+i);

                return;
            }
            else{
                for(int j=i+1;j<arr.length;j++){
                    csum=csum+arr[j];
                    if(csum==sum){
                        System.out.println("sum at index starts"+i+ "ends at "+ j);
                        return;
                    }
                }
            }
        }
        System.out.println();*/

        
    }

    public static void main(String[] args) {
        SubArray sb=new SubArray();
        int arr[] = {1, 4, 20, 3, 10, 5};
        int sum=100;
        sb.sumArray(arr,sum);

    }
}

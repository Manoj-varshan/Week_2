public class MinMaxSum{
    public void minmaxsum(int [] arr){
        int totalsum=0;
        int min= arr[0];
        int max= arr[0];

        for(int i =0;i<arr.length;i++){
            totalsum+=arr[i];

            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
         int minelement=totalsum-max;
         int maxelement=totalsum-min;

         System.out.println("Minimum Sum"+ minelement+" "+"MaximumSum:" + maxelement);
    }
    public static void main(String[] args) {
        MinMaxSum obj = new MinMaxSum();
        int arr[] ={1,2,3,4,5};
        obj.minmaxsum(arr);
    }
}
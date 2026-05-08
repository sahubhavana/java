30.Printing a sum of sub arrray
static int sum;
public static int   subarray(int arr[],int i,int sum,int k){
   if(i==arr.length){
       return (sum == k) ? 1 : 0;
   }
   return subarray(arr, i + 1, sum + arr[i], k)
           + subarray(arr, i + 1, sum, k);
}

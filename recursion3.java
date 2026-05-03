/ 10. to find a minimum number from array
   public static int arrmin(int arr[],int i){
   if (i==arr.length-1) return arr[i] ;
   return Math.min(arr[i],arrmin(arr,i+1));
}

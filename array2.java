static int sum=0;
   public static int array2(int arr[],int i){
        if(i==arr.length) return sum;
        sum=sum+arr[i];
        return array2(arr,i+1);
   }

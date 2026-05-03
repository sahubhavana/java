13 .Sum of even number in array
static int sum=0;
public static int evensum(int arr[],int i){
   if(i==arr.length) return sum;
   if(arr[i]%2==0){
       sum=sum+arr[i];
   }
   return evensum(arr,i+1);
}

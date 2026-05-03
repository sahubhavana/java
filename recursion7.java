14. replace element of array 2 with 5
public static void  replace(int arr[],int i){
   if(i==arr.length) return ;
   if(arr[i]==2){
       arr[i]=5;
   }
   replace(arr,i+1);
}

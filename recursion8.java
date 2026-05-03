/ 15.check either negative present of not
public static boolean checkhnp(int arr[],int i){
   if(i==arr.length) return true;
   if(arr[i]<0){
       return false;
   }
   return checkhnp(arr,i+1);
}

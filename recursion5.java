12. to check key present or not

public static boolean checknum(int arr[],int i,int x) {
   if (i == arr.length) return false;
   if (arr[i] == x) {
       return true;
   }
   return checknum(arr, i + 1, x);
}

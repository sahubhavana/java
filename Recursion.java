9.to print a element of array
public static void arraynum(int arr[],int i){
   if(i==arr.length) return;
   System.out.print(arr[i]+" ");
   arraynum(arr,i+1);
}

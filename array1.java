public static void array1(int arr[],int i){
        if(i==arr.length) return;
        System.out.print(arr[i]+" ");
        array1(arr,i+1);
   }

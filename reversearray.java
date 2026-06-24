public static void reversearray(int[] arr,int i){
        if(i==-1){
            return;
        }
        System.out.print(arr[i]+" ");
        reversearray(arr,i-1);
    }

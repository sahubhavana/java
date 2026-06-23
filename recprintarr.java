public static void printarray(int[] arr,int i){
        if(i==arr.length){
            return;
        }
        System.out.print(arr[i]+" ");
        printarray(arr,i+1);
    }

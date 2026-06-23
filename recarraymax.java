static int max=0;
    public static int printarraymax(int[] arr,int i){
        if(i==arr.length){
            return max;
        }
        if(arr[i]>max){
            max=arr[i];
        }
        return printarraymax(arr,i+1);
    }

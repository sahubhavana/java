public static int foundindex(int[] arr,int i,int k){
        if(i==arr.length){
            return 0;
        }
        if (k==arr[i]){
            return i;

        }


        return foundindex(arr,i+1,k);
    }

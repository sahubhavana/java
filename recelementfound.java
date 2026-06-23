public static boolean found(int[] arr,int i,int k){
        if(i==arr.length){
            return false;
        }
        if(k==arr[i]){
            return true;

        }
        return found(arr,i+1,k);
    }

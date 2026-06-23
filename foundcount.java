static int count=0;
    public static int foundcount(int[] arr,int i,int k){
        if(i==arr.length){
           return count;
        }
        if(arr[i]==k){
            count++;
        }
        return foundcount(arr,i+1,k);
    }

public static int partion(int [] arr,int lb,int ub){
        int pivot=arr[lb];
        int start=lb;
        int end=ub;
        while(start<end){
            while(start<=end&& arr[start]<=pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }
            if(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
        }
        int temp=arr[lb];
        arr[lb]=arr[end];
        arr[end]=temp;
        return end;
    }
    public static void quick(int[] arr, int lb,int ub ){
        if(lb<ub){
            int loc=partion(arr,lb,ub);
            quick(arr,lb,loc-1);
            quick(arr,loc+1,ub);
        }
    }

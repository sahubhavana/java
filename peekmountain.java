public static int peek_mountain(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(start+end)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }
            else{
                if(arr[mid]<arr[mid+1]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }

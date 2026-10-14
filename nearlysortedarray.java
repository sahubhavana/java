public static int nearlysortedarray(int []arr,int k){
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==k){
                return mid;
            }
            if(arr[mid+1]==k){
                return mid+1;
            }
            if(arr[mid-1]==k){
                return mid-1;
            }
            if(k>arr[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }

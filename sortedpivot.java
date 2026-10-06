public static int pivot(int[]arr){
        int s=0;
        int ans=-1;
        int e=arr.length-1;
        int n=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]>arr[n]){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
                }


            }

        return ans;
    }

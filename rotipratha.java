public static boolean isvalidtime(int arr[],int mid,int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            int cc = arr[i];
            int j = 1;
            int timetaken = 0;
            while (timetaken + j * cc <= mid) {
                timetaken += j * cc;
                j++;
                count++;
            }
            if (count >= n) {
                return true;
            }
        }

            return false;
    }

    public static int rotipratha(int arr[],int k,int n){
        Arrays.sort(arr);
        int ans=-1;
        int x=arr[arr.length-1];
        int s=0;
        int e=x*(n*(n+1)/2);
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isvalidtime(arr,mid,n)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }

static boolean validsolution(int[]arr,int k,int mid){
        int paintercount=1;
        int paintlength=0;
        for(int i=0;i<arr.length;i++){
            if(paintlength+arr[i]<=mid){
                paintlength=paintlength+arr[i];
            }
            else{
                paintercount++;
                paintlength=0;
                if(paintercount>k||arr[i]>mid){
                  return false;
                }
                else{
                    paintlength=paintlength+arr[i];
                }
            }
        }
        return true;
 }
 public static int painterboard(int[] arr,int k){
        int start=1;
        int end=0;
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            end=end+arr[i];
        }
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (validsolution(arr, k, mid)) {
                ans = mid;
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
            return ans;

 }

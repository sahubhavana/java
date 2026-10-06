class Solution {
    public int mySqrt(int x) {
        int ans=0;
        int s=1;
        int e=x;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid==x/mid){
                return mid;
            }
            else{
                if(x/mid<mid){
                    e=mid-1;
                }
                else{
                    ans=mid;
                    s=mid+1;
                }
            }
        }
        return ans;
    }
}

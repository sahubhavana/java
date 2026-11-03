class Solution {
    public int pivotInteger(int n) {
       
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        int rsum=0;
        for(int i=n;i>=1;i--){
            rsum=rsum+i;
            if(rsum==(sum-rsum+i)){
                return i;
            }
        }
        return -1;
        
    }

}

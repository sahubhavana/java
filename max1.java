class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int mxc=0;
        int fc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
              mxc++;
            }
            if(mxc>fc){
                fc=mxc;
            }
            else{
                if(nums[i]==0){
                mxc=0;
                
            }
        }
        }
        return fc;
    }
}

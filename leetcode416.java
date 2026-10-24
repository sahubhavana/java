class Solution {

    public boolean cp(int[] nums,int target,int i){
          if(target==0){
            return true;
          }
          if(i==nums.length||target<0){
            return false;
          }
          boolean include=cp(nums,target-nums[i],i+1);
          boolean exclude=cp(nums,target,i+1);
          return include||exclude;
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int n:nums){
            sum=sum+n;
        }
         if (sum % 2 != 0) {
            return false;
        }
        int target=sum/2;
        boolean ans=cp(nums,target,0);
        return ans;
    }
}

class Solution {
    public boolean checkSubsequenceSum(int[] nums, int k) {
         int x=sqtok(nums,0,0,k,0);
         if(x>0){
            return True;
         }

    }
    public static int sqtok(int[] nums,int sum,int index,int k){
        if(index==nums.length){
            if(sum==k){
                return 1;
            }
            return 0;
        }
        int take=sqtok(nums,sum+nums[index],index+1,k);
        int notake=sqtok(nums,sum,index+1,k);
        return take+notake;
    } 
}

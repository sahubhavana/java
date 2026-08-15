    class Solution {
    public int majorityElement(int[] nums) {
        int x=nums.length/2;
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count=count+1;
                }

            }
            if(count>x){
                return nums[i];
            }
        }
    }
}

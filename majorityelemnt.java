class Solution {
    public int majorityElement(int[] nums) {
       int n=nums.length;
        int count=0;
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    count=count+1;
                }
            }
            if(count>(n/2)){
                return nums[i];
            }
            
            count=0;
        }
        return 0;
        
    }
}

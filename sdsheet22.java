class Solution {
    public List<Integer> majorityElementTwo(int[] nums) {
       List<Integer> ans = new ArrayList<>();
        int n=nums.length/3;
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>n){
                ans.add(nums[i]);
            }
            count=0;
        }
        return ans;
    }
}

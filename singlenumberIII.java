class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<=nums.length-2;i=i+2){
            if((nums[i]^nums[i+1])!=0){
                return new int[]{nums[i],nums[i+1]};
            }
        }
        return new int[]{};
    }
}

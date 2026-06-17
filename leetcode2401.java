class Solution {
    public int longestNiceSubarray(int[] nums) {
        int count=1;
        for(int i=0;i<nums.length;i++){
               int mask=0;
            for(int j=i;j<nums.length;j++){
                if((mask&nums[j])!=0){
                  break;

                }
                mask|=nums[j];
                count=Math.max(count,j-i+1);
            }
        }
        return count;
    }
}

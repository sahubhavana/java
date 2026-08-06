class Solution {
    public void rotateArrayByOne(int[] nums) {
        int temp=nums[0];
        for(itn i=0;i<nums.length-1;i++){
            nums[j]=nums[j+1];
        }
        nums[nums.length-1]=temp;
    }
}

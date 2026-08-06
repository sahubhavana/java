class Solution {
    public void rotateArray(int[] nums, int k) {
        int temp;
        for(int i=0;i<k;i++){
            temp=nums[0];
            for(int j=0;j<nums.length-1;j++){
                nums[j]=nums[j+1];
            }
            nums[nums.length-1]=temp;
        }
    }
}

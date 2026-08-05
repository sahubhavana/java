class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;i<nums.length;i++){
        if(nums[i]!=nums[j]){
            nums[i+1]=nums[j];
            i++;
        }
    }
   return i+1;
 } 
}
            
                   
                 

class Solution {
    int ind=-1;
    public int linearSearch(int nums[], int target) {
		for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ind=i;
                break;
            }
        }
        return ind;
    }
}

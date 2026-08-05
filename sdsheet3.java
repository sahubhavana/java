class Solution {
    public boolean isSorted(ArrayList<Integer> nums) {
        boolean check=true;
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)>nums.get(i+1)){
                  check=false;
            }
        }
        return check;
    }
}

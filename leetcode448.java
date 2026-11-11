class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        boolean s=false;
        for(int i=1;i<=nums.length;i++){
            s=false;
            for(int j=0;j<nums.length;j++){
                if(i==nums[j]){
                    s=true;
                    break;
                }
            }
            if(s==false){
                ans.add(i);
            }
        }
        return ans;
    }
}

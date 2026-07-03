class Solution {
    public List<Integer> subsetSums(int[] nums) {
    ArrayList<Integer> ls=new ArrayList<>();
    ss(nums,ls,0,0);
    return ls;
    }
    public void ss(int[] nums,ArrayList<Integer> ls,int sum,int idx){
        if(idx==nums.length){
              ls.add(sum);
            return;
        }
        ss(nums,ls,sum+nums[idx],idx+1);
        ss(nums,ls,sum,idx+1);
    }
}

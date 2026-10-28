class Solution {
    static void solve (int[]nums,List<Integer>out,List<List<Integer>>ans,int i){
        if(i>=nums.length){
            ans.add(new ArrayList<>(out));
        
        return;
        }
        out.add(nums[i]);
        solve(nums,out,ans,i+1);
        out.remove(out.size() - 1);
        solve(nums,out,ans,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>out=new ArrayList<>();
        solve(nums,out,ans,0);
        return ans;
    }
}

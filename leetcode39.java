class Solution {
     static void solve(int[] candidates, int target,
                      List<Integer> out,
                      List<List<Integer>> ans,
                      int sum, int i) {

        // Base case
        if (sum == target) {
            ans.add(new ArrayList<>(out));
            return;
        }

        if (i >= candidates.length || sum > target) {
            return;
        }

        // Include: Same element can be used again
        out.add(candidates[i]);

        solve(candidates, target, out, ans,
              sum + candidates[i], i);

        // Backtracking
        out.remove(out.size() - 1);

        // Exclude: Move to next element
        solve(candidates, target, out, ans, sum, i + 1);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int sum=0;
        int i=0;
       
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer> out=new ArrayList<>();
        solve(candidates,target,out,ans,0,0);
        return ans;
    }
}

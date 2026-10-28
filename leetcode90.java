
import java.util.*;

class Solution {
    static void solve(int[] nums, List<Integer> out,
                      List<List<Integer>> ans, int index) {
        if(index>=nums.length){
        ans.add(new ArrayList<>(out));
        return;
        }
      

            out.add(nums[index]);
            solve(nums, out, ans, index + 1);
            out.remove(out.size() - 1);
           
            while(index+1<nums.length && nums[index]==nums[index+1]){
                index++;
            }
            solve(nums, out, ans, index+ 1);
        }
        
    

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> out = new ArrayList<>();

        solve(nums, out, ans, 0);

        return ans;
    }
}

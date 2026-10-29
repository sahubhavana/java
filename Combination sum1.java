
import java.util.*;

class Solution {
    public void solve(int[] arr, int target, int index,
                      List<Integer> temp,
                      List<List<Integer>> ans) {

        // Base case 1
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        // Base case 2
        if (index == arr.length || target < 0) {
            return;
        }

        // Pick
        temp.add(arr[index]);
        solve(arr, target - arr[index], index, temp, ans);

        // Backtrack
        temp.remove(temp.size() - 1);

        // Not Pick
        solve(arr, target, index + 1, temp, ans);
    }

    public List<List<Integer>> combinationSum(int[] candidates,
                                               int target) {
        List<List<Integer>> ans = new ArrayList<>();

        solve(candidates, target, 0,
              new ArrayList<>(), ans);

        return ans;
    }
}

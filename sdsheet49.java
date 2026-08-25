class Solution {

    public int countSubsequenceWithTargetSum(int[] nums, int k) {
        return solve(nums, 0, 0, k);
    }

    static int solve(int[] nums, int index, int sum, int k) {

        if (index == nums.length) {
            if (sum == k)
                return 1;
            return 0;
        }

        // include
        int take = solve(nums, index + 1, sum + nums[index], k);

        // exclude
        int notTake = solve(nums, index + 1, sum, k);

        return take + notTake;
    }
}

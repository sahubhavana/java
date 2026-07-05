public static void subset(int[] nums, int idx, List<Integer> ds) {

    if (idx == nums.length) {
        System.out.println(ds);
        return;
    }

    ds.add(nums[idx]);
    subset(nums, idx + 1, ds);

    ds.remove(ds.size() - 1);
    subset(nums, idx + 1, ds);
}

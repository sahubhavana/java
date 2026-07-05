public static void permute(int[] nums, List<Integer> ds, boolean[] vis) {

    if (ds.size() == nums.length) {
        System.out.println(ds);
        return;
    }

    for (int i = 0; i < nums.length; i++) {

        if (vis[i])
            continue;

        vis[i] = true;
        ds.add(nums[i]);

        permute(nums, ds, vis);

        ds.remove(ds.size() - 1);
        vis[i] = false;
    }
}

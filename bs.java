public static int[] bubbleSort(int[] nums) {
    int n = nums.length;
    for (int i = 0; i < n - 1; i++) {
        boolean flag = false;
        for (int j = 0; j < n - i - 1; j++) {
            if (nums[j] > nums[j + 1]) {
                flag = true;
                int temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
            }
        }
        if (flag == false) {
            break;
        }
    }
    return nums;
}

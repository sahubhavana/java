public static boolean isvalidheight(int[] arr, int m, int mid) {
        long count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mid) {
                count += arr[i] - mid;
            }
        }

        return count >= m;
    }

    public static int ekospoj(int[] arr, int m) {
        Arrays.sort(arr);

        int ans = -1;
        int s = 0;
        int e = arr[arr.length - 1];

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (isvalidheight(arr, m, mid)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return ans;
    }

public static int unboundedsearch(int[] arr, int t) {
    if (arr.length == 0) {
        return -1;
    }

    if (arr[0] == t) {
        return 0;
    }

    int i = 1;

    while (i < arr.length && arr[i] <= t) {
        i = i * 2;
    }

    int s = i / 2;
    int e = Math.min(i, arr.length - 1);

    while (s <= e) {
        int mid = s + (e - s) / 2;

        if (arr[mid] == t) {
            return mid;
        } else if (arr[mid] > t) {
            e = mid - 1;
        } else {
            s = mid + 1;
        }
    }

    return -1;
}

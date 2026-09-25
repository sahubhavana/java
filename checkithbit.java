//2.. Check the ith Bit

    public static boolean checkbit(int n, int i) {
        return (n & (1 << i)) != 0;
    }

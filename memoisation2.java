2.To print a digit count

    public static int Countdig(int n, int[] dp) {
        if (n == 0) return 0;

        if (dp[n] != -1) {
            return dp[n];
        }

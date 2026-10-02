    public static void row2darraysum(int[][] arr,int n) {
        int[] ans = new int[n];
        int sum = 0;
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum = sum + arr[i][j];
            }
            ans[k] = sum;
            k++;
            sum=0;
        }
        for (int i = 0; i < ans.length; i++) {


            System.out.print(ans[i]+" ");
        }
    }

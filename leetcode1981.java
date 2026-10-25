class Solution {
    public int ans(int[][]mat,int target,int row,int sum){
        if(row==mat.length){
            return Math.abs(target-sum);
        }
        int min=Integr.MAX_VALUE;
        for(int n:mat[row])
        int a=ans(mat,target,row+1,sum+n);
        min=Math.min(a,min);
        return min;
    }
    public int minimizeTheDifference(int[][] mat, int target) {
        int row=0;
        int sum=0;

        int x=ans(mat,target,row,sum);
        return x;
    }
}

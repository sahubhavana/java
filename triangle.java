class Solution {
    public int solve( List<List<Integer>>triangle,int rowindx,int coindx){
        if(rowindx==triangle.size()-1){
            return triangle.get(rowindx).get(coindx);
        }
        int row=solve(triangle,rowindx+1,coindx);
        int col=solve(triangle,rowindx+1,coindx+1);
        int a=triangle.get(rowindx).get(coindx)+Math.min(row,col);
        return a;

    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int ans=solve(triangle,0,0);
        return ans;
    }
}

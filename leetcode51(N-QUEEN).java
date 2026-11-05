class Solution {
    static boolean issafe(int n,int r ,int colindex,char[][]board){
        //to check upper left diagonal
        int row=r;
        int col=colindex;
        while(row>=0 && col>=0){
            if(board[row][col]=='Q') return false;
            row--;
            col--;
        }
        // to check lower diagonal 
        row =r;
        col=colindex;
        while(row<n&&col>=0){
             if(board[row][col]=='Q') return false;
            row++;
            col--;
        }

        // to check in same row left side
          
        row =r;
        col=colindex;
        while(col>=0){
             if(board[row][col]=='Q') return false;
            
            col--;
        }
        return true;
    }
    static void solve(int n,char[][]board,int colindex,List<List<String>>ans){
        // base case
        if(colindex>=n){
            List<String>temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        for(int r=0;r<n;r++){
            if(issafe(n,r,colindex,board)){
            board[r][colindex]='Q';
            solve(n,board,colindex+1,ans);
            //backtracking approach
            board[r][colindex]='.';
            }

        }
    }
    public List<List<String>>solveNQueens(int n) {
        List<List<String>>ans=new ArrayList<>();
        char[][]board=new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        int colindex=0;
        solve(n,board,colindex,ans);
        return ans;
    }
}

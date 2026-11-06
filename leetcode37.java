class Solution {

    static boolean issafe(char[][]board,int row,int col,char value){
        ///check horizontal 
        for(int coli=0;coli<9;coli++){
               if(board[row][coli]==value){
                return false;
               }
        }

        ///check vertically dowm ward

        for(int rowi=0;rowi<9;rowi++){
            if(board[rowi][col]==value){
                return false;
            }
        }

        /// check in 3x3 grid
        int startrow=row-row%3;
        int startcol=col-col%3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                
                if(board[startrow+i][startcol+j]==value){
                    return false;
                }
            }
        }
        return true; 

    }
    static boolean emptycell(char[][]board,int[]cell){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    cell[0]=i;
                    cell[1]=j;
                    return true;
                }
            }
        }
        return false;
    }
    static boolean solve(char[][]board){
        // base case 
        int[]cell=new int[2];
        if(!emptycell(board,cell)){
            // matlab sare cell fill ho chuke hai hame koi bhi cell fill karne ki jarurat nahi hai
            return true;
        }
        int row=cell[0];
        int col=cell[1];
        
            for(int i=1;i<=9;i++){
                char value=(char)(i+'0');
                if(issafe(board,row,col,value)){
                board[row][col]=value;
                
                if(solve(board)){
                    return true;
                }
                
                //backtracking 
                board[row][col]='.';
            }
               
        // ham is problem ko solve nahi kar sakte 
            }

        return false;
    }
    public void solveSudoku(char[][] board) {
      solve(board);
    }
}

class Solution {
    int cnt;
    public int totalNQueens(int n) {
        char[][] board=new char[n][n];
        for(char[] row:board) Arrays.fill(row,'.');
        int[] leftRow=new int[n];
        int[] lowerDiagonal=new int[2*n-1];
        int[] upperDiagonal=new int[2*n-1];

        solve(0,board,n,leftRow,lowerDiagonal,upperDiagonal);
        return cnt;
    }
    void solve(int col,char[][] board,int n,int[] leftRow,int[] lowerDiagonal,
                int[] upperDiagonal
                )
    {
        if(col==n){
            cnt++;
        }
        for(int row=0;row<n;row++){
            if(leftRow[row]==0 && lowerDiagonal[row+col]==0 && upperDiagonal[n-1+col-row]==0){
                board[row][col]='Q';
                leftRow[row]=1;
                lowerDiagonal[row+col]=1;
                upperDiagonal[n-1+col-row]=1;
                solve(col+1,board,n,leftRow,lowerDiagonal,upperDiagonal);
                board[row][col]='.';
                leftRow[row]=0;
                lowerDiagonal[row+col]=0;
                upperDiagonal[n-1+col-row]=0;
            }
        }
    }
}
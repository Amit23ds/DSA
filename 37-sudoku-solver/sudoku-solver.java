class Solution {
    public void solveSudoku(char[][] board) {
        helper(board);
    }
    boolean helper(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='.'){
                    for(char d='1';d<='9';d++){
                        if(isValid(board,i,j,d)){
                            board[i][j]=d;
                            if(helper(board)){
                                return true;
                            }
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    boolean isValid(char[][] board,int i,int j,char d){
        for(int k=0;k<9;k++){
            if(board[k][j]==d) return false;
            if(board[i][k]==d) return false;
        }
        int row=(i/3)*3;
        int col=(j/3)*3;
        for(int a=0;a<3;a++){
            for(int b=0;b<3;b++){
                if(board[row+a][col+b]==d){
                    return false;
                }
            }
        }
        return true;
    }
}
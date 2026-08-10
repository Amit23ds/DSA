class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
                if(board[i][j]==word.charAt(0) && helper(board,word,i,j,0)) {
                    return true;
                }
            }
        }
        return false;
    }
    int[][] direction={{0,1},{0,-1},{1,0},{-1,0}};
    public boolean helper(char[][] board,String word,int i,int j,int idx){
        if(idx==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>board.length-1 || j>board[0].length-1 || board[i][j]=='$' || board[i][j]!=word.charAt(idx)){
            return false;
        }
        char temp=board[i][j];
        board[i][j]='$';
        for(int[] dir: direction){
            int new_i=i+dir[0];
            int new_j=j+dir[1];
            if(helper(board,word,new_i,new_j,idx+1)){
                board[i][j]=temp;
                return true;
            }
        }
        // if(helper(board,word,i+1,j,idx+1)){
        //     board[i][j]=temp;
        //     return true;
        // }
        // if(helper(board,word,i-1,j,idx+1)) {
        //     board[i][j]=temp;
        //     return true;
        // }
        // if(helper(board,word,i,j+1,idx+1)){
        //     board[i][j]=temp;
        //     return true;
        // }
        // if(helper(board,word,i,j-1,idx+1)) {
        //     board[i][j]=temp;
        //     return true;
        // }
        board[i][j]=temp;
        return false;
    }

}
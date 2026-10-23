class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        boolean[][] vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            int[] temp={0,m-1};
            for(int j:temp){
                if(board[i][j]=='O' && !vis[i][j]){
                    dfs(board,vis,i,j);
                }
            }
        }
        for(int j=0;j<m;j++){
            int[] temp={0,n-1};
            for(int i:temp){
                if(board[i][j]=='O' && !vis[i][j]){
                    dfs(board,vis,i,j);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O' && !vis[i][j]){
                    board[i][j]='X';
                }
            }
        }
    }
    void dfs(char[][] board,boolean[][] vis,int i,int j){
        int n=board.length;
        int m=board[0].length;
        vis[i][j]=true;
        int[] dx={-1,1,0,0};
        int[] dy={0,0,-1,1};

        for(int d=0;d<4;d++){
            int nx=i+dx[d];
            int ny=j+dy[d];
            if(nx>=0 && nx<n && ny>=0 && ny<m){
                if(board[nx][ny]=='O' && !vis[nx][ny]){
                    dfs(board,vis,nx,ny);
                }
            }
        }
    }
}
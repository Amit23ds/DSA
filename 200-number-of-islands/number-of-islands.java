class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int cnt=0;
        boolean[][] vis=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    dfs(i,j,grid,vis);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    void dfs(int i,int j,char[][] grid,boolean[][] vis){
        vis[i][j]=true;
        int m=grid.length;
        int n=grid[0].length;
        
        int[] dx={-1,1,0,0};
        int[] dy={0,0,-1,1};

        for(int d=0;d<4;d++){
            int nx=i+dx[d];
            int ny=j+dy[d];
            if(nx>=0 && nx<m && ny>=0 && ny<n){
                if(grid[nx][ny]=='1' && !vis[nx][ny]){
                    dfs(nx,ny,grid,vis);
                }
            }
        }
    }
}
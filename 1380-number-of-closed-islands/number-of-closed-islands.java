class Solution {
    public int closedIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0 && !vis[i][j] && dfs(i,j,grid,vis)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    boolean dfs(int i,int j,int[][] grid,boolean[][] vis){
        int n=grid.length;
        int m=grid[0].length;
        vis[i][j]=true;
        int[] dx={-1,1,0,0};
        int[] dy={0,0,-1,1};
        boolean flag=true;
        for(int d=0;d<4;d++){
            int nx=i+dx[d];
            int ny=j+dy[d];

            if(nx<0 || nx>=n || ny<0 || ny>=m){
                flag=false;
            }else if(grid[nx][ny]==0 && !vis[nx][ny]){
                boolean res=dfs(nx,ny,grid,vis);
                flag=flag && res;     
            }
        }
        return flag;
    }
}
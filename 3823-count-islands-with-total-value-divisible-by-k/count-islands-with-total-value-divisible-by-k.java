class Solution {
    public int countIslands(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int cnt=0;
        boolean[][] vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0 && !vis[i][j]){
                   long sum=bfs(grid,vis,i,j,(long)grid[i][j]);
                   if(sum%k==0) cnt++;
                }
            }
        }
        return cnt;
        
    }
    long bfs(int[][] grid,boolean[][] vis,int i,int j,long sum){
        int n=grid.length;
        int m=grid[0].length;
        vis[i][j]=true;
        Queue<int[]> q=new LinkedList<>();
        long num=sum;
        q.offer(new int[]{i,j});
        int[] dx={-1,1,0,0};
        int[] dy={0,0,-1,1};

        while(!q.isEmpty()){
            int[] temp=q.poll();
            for(int d=0;d<4;d++){
                int nx=temp[0]+dx[d];
                int ny=temp[1]+dy[d];
                if(nx>=0 && nx<n && ny>=0 && ny<m){
                    if(grid[nx][ny]!=0 && !vis[nx][ny]){
                        num+=grid[nx][ny];
                        q.offer(new int[]{nx,ny});
                        vis[nx][ny]=true;
                    }
                }
            }
        }
        return num;
    }
}
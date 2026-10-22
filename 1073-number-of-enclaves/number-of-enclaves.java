class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        Queue<int[]> q=new LinkedList<>();
        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};

        for(int i=0;i<n;i++){
            int[] temp={0,m-1};
            for(int j:temp){
                if(grid[i][j]==1){
                    grid[i][j]=0;
                    q.offer(new int[]{i,j});
                }
            }
        }
        for(int j=0;j<m;j++){
            int[] temp={0,n-1};
            for(int i:temp){
                if(grid[i][j]==1){
                    grid[i][j]=0;
                    q.offer(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty()){
            int[] cell=q.poll();
            for(int d=0;d<4;d++){
                int nr=cell[0]+dr[d];
                int nc=cell[1]+dc[d];
                
                if(nr>=0 && nc>=0 && nr<n && nc<m){
                    if(grid[nr][nc]==1){
                        grid[nr][nc]=0;
                        q.offer(new int[]{nr,nc});
                    }
                }
            }
        }
        int cnt=0;
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                cnt+=grid[row][col];
            }
        }
        return cnt;
    }
}
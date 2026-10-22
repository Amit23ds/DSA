class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int fresh=0;
        int cnt=0;



        Queue<int[]> q=new LinkedList<>();
        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        while(!q.isEmpty() && fresh>0){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] temp=q.poll();
                for(int d=0;d<4;d++){
                    int nr=temp[0]+dr[d];
                    int nc=temp[1]+dc[d];

                    if(nr>=0 && nc>=0 && nr<n && nc<m){
                        if(grid[nr][nc]==1){
                            fresh--;
                            grid[nr][nc]=2;
                            q.offer(new int[]{nr,nc});
                        }
                    }
                }
            }
            cnt++;
        }
        if(fresh>0) return -1;
        return cnt;
        
    }
}
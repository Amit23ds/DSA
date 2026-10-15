class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;

        int[][] res=new int[m][n];

        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i,j});
                    res[i][j]=0;
                }else{
                    res[i][j]=-1;
                }
            }
        }
        while(!q.isEmpty()){
            int[] cell=q.poll();
            int i=cell[0];
            int j=cell[1];

            int[] dx={-1,1,0,0};
            int[] dy={0,0,1,-1};

            for(int d=0;d<4;d++){
                int nx=i+dx[d];
                int ny=j+dy[d];

                if(nx>=0 && nx<m && ny>=0 && ny<n && res[nx][ny]==-1){
                    res[nx][ny]=res[i][j]+1;
                    q.add(new int[]{nx,ny});
                }
            }
        }
        return res;
    }
}
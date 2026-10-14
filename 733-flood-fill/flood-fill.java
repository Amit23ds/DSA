class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int temp=image[sr][sc];
        image[sr][sc]=color;
        int m=image.length;
        int n=image[0].length;
        boolean[][] vis=new boolean[m][n];

        dfs(sr,sc,image,vis,temp,color);

        return image;
    }
    void dfs(int i,int j,int[][] image,boolean[][] vis,int temp,int color){
        vis[i][j]=true;
        int m=image.length;
        int n=image[0].length;

        int[] dx={-1,1,0,0};
        int[] dy={0,0,1,-1};

        for(int d=0;d<4;d++){
            int nx=i+dx[d];
            int ny=j+dy[d];
            if(nx>=0 && nx<m && ny>=0 && ny<n){
                if(image[nx][ny]==temp && !vis[nx][ny]){
                    image[nx][ny]=color;
                    dfs(nx,ny,image,vis,temp,color);
                }
            }
        }
    }
}
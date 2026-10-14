class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int temp=image[sr][sc];
        if(temp!=color){
            dfs(sr,sc,image,color,temp);
        }
        return image;
    }
    void dfs(int sr,int sc,int[][] image,int color,int temp){
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc] != temp) return;

        image[sr][sc] = color;
        dfs(sr+1,sc,image,color,temp);
        dfs(sr-1,sc,image,color,temp);
        dfs(sr,sc+1,image,color,temp);
        dfs(sr,sc-1,image,color,temp);
    }
}
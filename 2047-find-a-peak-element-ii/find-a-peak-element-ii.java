class Solution {
    private int helper(int[][] mat,int mid,int n, int m){
        int maxValue=-1;
        int index=-1;
        for(int i=0;i<n;i++){
            if(mat[i][mid]>maxValue){
                maxValue=mat[i][mid];
                index=i;
            }
        }
        return index;
    }

    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int low=0;
        int high=m-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=helper(mat,mid,n,m);
            
            int left=mid-1>0 ? mat[row][mid-1] : -1;
            int right=mid+1<m ? mat[row][mid+1] : -1;

            if(mat[row][mid]>left && mat[row][mid]>right){
                return new int[]{row,mid};
            }
            if(mat[row][mid]>left && mat[row][mid]<right){
                low=mid+1;
            }else{
                high=mid-1;
            }
        } 
        return new int[]{-1,-1};    
    }
}
class Solution {
    private void swap(int[][] nums, int i, int j){
        int temp = nums[i][j];
        nums[i][j]=nums[j][i];
        nums[j][i]=temp;
    }

    public void rotate(int[][] matrix) {
        int n=matrix.length;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(i!=j){
                    swap(matrix,i,j);
                }
            }
        }
        int l=0, r=n-1;
        while(l<r){
            for(int i=0;i<n;i++){
                int temp=matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r]=temp;
            }
            l++;
            r--;
        }
    }
}
class Solution {

    private int helper(int[][] nums,int mid){
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int low=0;
            int high=n-1;
            while(low<=high){
                int mi=low+(high-low)/2;
                if(nums[i][mi]>mid){
                    high=mi-1;
                }else{
                    low=mi+1;
                }
            }
            count+=low;
        }
        return count;
    }

    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;  
        int low=matrix[0][0];
        int high=matrix[n-1][n-1];
        while(low<=high){
            int mid=low+(high-low)/2;
            int count=helper(matrix,mid);
            if(count<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
}
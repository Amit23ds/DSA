class Solution {
    private int lowerBound(int[] arr, int target) {
        
        int n=arr.length;
        int low= 0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    private int upperBound(int[] arr, int target) {

        int n= arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
                
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
       int n= nums.length;
       int lb=lowerBound(nums,target);
       if(lb==n || nums[lb]!=target){
        return new int[]{-1,-1};
       }
       return new int[]{lb,upperBound(nums,target)-1};
    }
}
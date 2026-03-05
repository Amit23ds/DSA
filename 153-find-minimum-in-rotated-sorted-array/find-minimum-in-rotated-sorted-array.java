class Solution {
    public int findMin(int[] nums) {
       int n=nums.length;
       int low=0;
       int high=n-1;
       int min=nums[low+(high-low)/2];
       while(low<=high){
            int mid=low+(high-low)/2;
            if(min>nums[mid]){
                min=nums[mid];
            }
            if(nums[high]<=min){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
       }
       return min;
    }
}
class Solution {
    private int peakEl(int[] nums) {
        int n=nums.length;
        if(n==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2]) return n-1;
        int low=1;
        int high=n-2;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(nums[mid+1]>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public int compareBitonicSums(int[] nums) {
        int n = peakEl(nums);
        long sum = 0;
        for(int i=0;i<=n;i++){
            sum+=nums[i];
        }
        long sum1=0;
        for(int i=n;i<nums.length;i++){
            sum1+=nums[i];
        }
        if(sum>sum1) return 0;
        else if(sum<sum1) return 1;
        return -1;
    }
}
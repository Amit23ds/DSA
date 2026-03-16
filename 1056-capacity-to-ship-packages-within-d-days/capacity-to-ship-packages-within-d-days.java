class Solution {
    private int totalSum(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
    private int maxElement(int[] nums){
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        return max;
    }
    private int dayRequired(int[] nums,int capacity){
        int days=1;
        int load=0;
        for(int i=0;i<nums.length;i++){
            if(load+nums[i]>capacity){
                days++;
                load=nums[i];
            }
            else{
                load+=nums[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=maxElement(weights);
        int high=totalSum(weights);
        while(low<=high){
            int mid=(low+high)/2;
            int ans=dayRequired(weights,mid);
            if(ans<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
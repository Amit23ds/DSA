class Solution {
    private int tSum(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }

    private int split(int[] nums,int mid){
        int ans=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<=mid){
                sum+=nums[i];
            }else{
                sum=nums[i];
                ans++;
            }
        }
        return ans;
    }

    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int low=Arrays.stream(nums).max().getAsInt();
        int high=tSum(nums);
        while(low<=high){
            int mid=low+(high-low)/2;
            if(split(nums,mid)<=k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;  
    }
}
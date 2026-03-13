class Solution {
    private int maxElement(int[] nums){
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        return max;
    }
    private int res(int[] nums,int mid){
        long ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=Math.ceil((double)nums[i]/mid);
        }
        return (int)ans;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=maxElement(nums);
        int ans=0;
        while(low<=high){
            int mid=(high+low)/2;
            if(res(nums,mid)<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return ans;
    }
}
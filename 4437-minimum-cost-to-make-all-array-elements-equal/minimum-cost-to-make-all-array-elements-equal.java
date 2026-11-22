class Solution {
    public long minCost(int[] nums) {
        int n=nums.length;
        int l=0;

        long ans=Long.MAX_VALUE;
        while(l<n){
            int r=l+1;
            while(r<n && nums[r]==nums[l]) r++;

            if(r>1 && l<n-1){
                long ct=1L*nums[l]*l + 1L*nums[l]*(n-r);
                ans=Math.min(ans,ct);
            }
            l=r;
        }
        return ans;
    }
}
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long min=1000000000, max=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            min=Math.min(min,nums[i]);
        }
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }
        return k*(max-min);
    }
}
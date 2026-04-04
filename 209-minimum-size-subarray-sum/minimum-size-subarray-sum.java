class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;
        
        for(int high = 0; high < nums.length; high++) {
            sum += nums[high];  // expand window
            
            while(sum >= target) {
                int len = high - low + 1;  // calculate BEFORE shrinking
                res = Math.min(res, len);
                
                sum -= nums[low];  // shrink window
                low++;
            }
        }
        
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
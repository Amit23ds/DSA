class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        
        int ans=nums[0];
        for(int i=1;i<n;i++) {
            if(nums[i]==nums[i-1]+1) {
                ans+=nums[i];
            }else{
                break;
            }
        }
        
        Arrays.sort(nums);
        for(int i=0;i<n;i++) {
            if(nums[i]==ans) {
                ans++;
            }
        }
        
        return ans;
    }
}
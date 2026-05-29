class Solution {
    public int minElement(int[] nums) {
        int ans =Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int x=nums[i];
            while(x>0){
                sum+=x%10;
                x/=10;
            }
            ans=Math.min(ans,sum);
        }
        return ans;
    }
}
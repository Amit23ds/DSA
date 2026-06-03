class Solution {
    private int helper(int[] nums, int k){

        int l=0, r=0, cnt=0;
        int res=0;
        while(r<nums.length){
            if(nums[r]%2!=0){
                cnt++;
            }
            while(cnt>k){
                if(nums[l]%2!=0) cnt--;
                l++;
            }
            res+=(r-l+1);
            r++;
        }
        return res;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
}
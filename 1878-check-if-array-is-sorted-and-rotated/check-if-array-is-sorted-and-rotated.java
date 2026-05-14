class Solution {
    public boolean check(int[] nums) {
        int cnt=0;
        if(nums[0]<nums[nums.length-1]) cnt++;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]) cnt++;
        }
        return cnt<=1;
    }
}
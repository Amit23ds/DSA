class Solution {
    public int minimumSwaps(int[] nums) {
        int l=0;
        int r=nums.length-1;

        int cnt=0;
        while(l<=r){
            if(nums[r]==0){
                r--;
                continue;
            }
            if(nums[l]==0){
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                r--;
                cnt++;
            }
                l++;
        }
        return cnt;
    }
}
class Solution {
    public int minMergedInteger(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i+=2){
            int temp=Integer.parseInt(String.valueOf(nums[i])+nums[i+1]);
            min=Math.min(min,temp);
        }
        return min;
    }
}
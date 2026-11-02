class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int l=0, r=n-1;
        int mid=l+(r-l)/2;
        int temp=nums[mid];
        int res=0;
        for(int i=0;i<n;i++){
            res+=Math.abs(nums[i]-temp);
        }
        return res;
    }
}
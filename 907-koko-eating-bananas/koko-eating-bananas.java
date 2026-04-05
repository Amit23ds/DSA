class Solution {
    private int maxEle(int[] nums){
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        return max;
    }
    private long helper(int[] nums,int mid){
        int ct=0;
        for(int i=0;i<nums.length;i++){
            ct+=Math.ceil((double)nums[i]/mid);
        }
        return ct;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=maxEle(piles);
        int n=piles.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            long res=helper(piles,mid);
            if(res<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}
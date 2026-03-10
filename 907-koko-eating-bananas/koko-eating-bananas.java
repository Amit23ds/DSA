class Solution {
    private int maxElement(int[] nums){
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
    private long cal(int[] nums,int rate){
        long count=0;
        for(int i=0;i<nums.length;i++){
            count+=Math.ceil((double)nums[i]/rate);
        }
        return count;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int k=0;
        int low=1;
        int high=maxElement(piles);
        while(low<=high){
            int mid=(low+high)/2;
            long count=cal(piles,mid);
            if(count<=h){
                // left search space
                k=mid;
                high=mid-1;
            }
            else{
                // right search space
                low=mid+1;
            }
        }
        return k;
    }
}
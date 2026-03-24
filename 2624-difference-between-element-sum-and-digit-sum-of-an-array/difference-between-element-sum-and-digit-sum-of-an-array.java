class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int dsum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int x=nums[i];
            while(x>0){
                dsum+=x%10;
                x/=10;
            }
        }
        return Math.abs(sum-dsum);
        
    }
}
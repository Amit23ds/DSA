class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int secondMax=0;
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            if(x>max){
                secondMax=max;
                max=x;
            }else if(x>secondMax){
                secondMax=x;
            }
        }
        return (max-1)*(secondMax-1);
    }
}
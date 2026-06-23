class Solution {
    public int majorityElement(int[] nums) {
        int n= nums.length;
        int el=0;
        int vote=0;

        for(int i=0;i<n;i++){
            if(vote==0){
                el=nums[i];
            }
            if(el==nums[i]){
                vote++;
            }else{
                vote--;
            }
        }
        // to verify

        return el;
    }
}
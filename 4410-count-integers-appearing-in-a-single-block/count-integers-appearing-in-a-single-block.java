class Solution {
    public int countSpecialIntegers(int[] nums) {
        int[] freq=new int[101];
        int i=0;
        while(i<nums.length){
            int temp=nums[i];
            freq[temp]++;
            while(i<nums.length && nums[i]==temp){
                i++;
            }
        }
        int res=0;
        for(i=1;i<=100;i++){
            if(freq[i]==1) res++;
        }
        return res;
    }
}
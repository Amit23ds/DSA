class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            int x= nums[i];
            while(x!=0){
                if(x%10==digit){
                    cnt++;
                }
                x=x/10;
            }
        }
        return cnt;
    }
}
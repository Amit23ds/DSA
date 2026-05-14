class Solution {
    public boolean isGood(int[] nums) {
        int n=0;
        for(int num:nums){
            n=Math.max(n,num);
        }
        int[] freq = new int[201];

        if(nums.length!=n+1) return false;

        for(int num:nums){
            freq[num]++;
        }

        for(int i=1;i<n;i++){
            if(freq[i]!=1) return false;
        }

        return freq[n]==2;
    }
}
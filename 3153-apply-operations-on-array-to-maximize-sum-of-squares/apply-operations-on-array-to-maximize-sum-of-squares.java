class Solution {
    int MOD=1_000_000_007;

    public int maxSum(List<Integer> nums, int k) {
        int bit=30;
        int[] cnt=new int[bit];

        for(int num:nums){
            for(int b=0;b<bit;b++){
                if((num & (1<<b))!=0){
                    cnt[b]++;
                }
            }
        }
        long res=0;
        while(k-->0){
            long curr=0;
            for(int b=0;b<bit;b++){
                if(cnt[b]>0){
                    cnt[b]--;
                    curr |= (1L<<b);
                }
            }
            res=(res+curr*curr)%MOD;
        }
        return (int)res;
    }
}
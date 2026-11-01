class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int x:nums){
            min=Math.min(x,min);
        }
        long res=0;
        for(int x:nums){
            res+=x-min;
        }
        return (int)res;
    }
}
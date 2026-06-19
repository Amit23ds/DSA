class Solution {
    public boolean isPowerOfTwo(int n) {
        //if(n==2) return true;

        //if(n&n-1==0) return true;

        return n>0 && ((n&(n-1))==0);
    }
}
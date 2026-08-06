class Solution {
    boolean helper(int n,int t){
        int ans =1;
        while(n>0){
            ans*=n%10;
            n/=10;
            if(ans==0) break;
        }
        return ans%t==0;
    }
    public int smallestNumber(int n, int t) {
        while(!helper(n,t)){
            n++;
        }
        return n;
    }
}
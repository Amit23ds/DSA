class Solution {
    public long sumAndMultiply(int n) {
        long x=0;    
        while(n!=0){
            if(n%10!=0){
                x=x*10+n%10;
            }
            n/=10;
        }
        long res=0;
        long sum=0;
        while(x!=0){
            res = res*10+x%10;
            sum+=x%10;
            x/=10;
        }
        return sum*res;
    }
}
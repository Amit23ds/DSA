class Solution {
    private static double power(double x, long n){
        if(n==0) return 1;
        if(n==1) return x;
        double half=power(x,n/2);
        if(n%2==0){
            return half*half;
        }else{
            return half*half*x;
        }
    }
    public double myPow(double x, int n) {
        long N=n;
        if(N<0){
            x=1/x;
            N=N*-1;
        }
        return power(x,N);
    }
}
class Solution {
    public boolean checkDivisibility(int n) {
        int m=n;
        int sum=0, product=1;
        while(m>0){
            int x=m%10;
            sum+=x;
            product*=x;
            m/=10;
        }

        return n%(sum+product)==0;
    }
}
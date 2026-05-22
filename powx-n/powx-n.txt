class Solution {
    double power(double b, int e) {
        // code here
        if(b==1.0)return b;
        
        if(e==0)return 1.00;
        if(e<0)return 1.0/power(b,-e);
        
        if(e%2==0) return power(b*b,e/2);
        else return b*power(b,e-1);
    }
}
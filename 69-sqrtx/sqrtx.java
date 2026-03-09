class Solution {
    public int mySqrt(int x) {
        long low=1;
        long high=(int)x;
        long ans=0;
        while(low<=high){
            long mid=(high+low)/2;
            if(mid*mid<=x){
                ans=mid;
            }
            if(mid*mid>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return (int)ans;
    }
}
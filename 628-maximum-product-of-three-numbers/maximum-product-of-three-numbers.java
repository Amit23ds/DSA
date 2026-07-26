class Solution {
    public int maximumProduct(int[] nums) {
        int f=Integer.MIN_VALUE, s=Integer.MIN_VALUE, t=Integer.MIN_VALUE;
        int m1 = Integer.MAX_VALUE, m2 = Integer.MAX_VALUE;

        for(int i=0; i<nums.length;i++){
            int x=nums[i];
            if(x>f){
                t=s;
                s=f;
                f=x;
            }else if(x>s){
                t=s;
                s=x;
            }else if(x>t){
                t=x;
            }

            if(x<m1) {
                m2=m1;
                m1=x;
            }else if(x<m2) {
                m2=x;
            }
        }
        return Math.max(f*s*t,f*m1*m2);
    }
}
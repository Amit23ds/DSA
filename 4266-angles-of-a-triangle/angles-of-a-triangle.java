class Solution {
    public double[] internalAngles(int[] nums) {
        if(nums[0]+nums[1]<=nums[2]||
           nums[1]+nums[2]<=nums[0]||
           nums[0]+nums[2]<=nums[1]){
            return new double[]{};
           }
        double a=nums[0];
        double b=nums[1];
        double c=nums[2];
        double A=Math.acos((b*b+c*c-a*a)/(2*b*c));
        double B=Math.acos((a*a+c*c-b*b)/(2*a*c));
        double C=Math.acos((b*b+a*a-c*c)/(2*b*a));
        // ans[0]=Math.round(a * 100000.0) / 100000.0;
        // ans[1]=Math.round(b * 100000.0) / 100000.0;
        A=Math.toDegrees(A);
        B=Math.toDegrees(B);
        C=Math.toDegrees(C);
        // A=Math.round(a * 100000.0) / 100000.0;
        //  B=Math.round(b * 100000.0) / 100000.0;
        //  C=Math.round(c * 100000.0) / 100000.0;
        double ans[]= {A,B,C};
        Arrays.sort(ans);
        return ans;
    }
}
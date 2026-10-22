class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        if(n==1) return 0;
        int i=0;
        while(nums[i]!=0){
            i++;
        }
        boolean inc=true;
        boolean dec=true;
        for(int j=1;j<n;j++){
            int temp=nums[(i+j)%n];
            if(temp!=j){
                inc=false;
            }
            if(temp!=n-j){
                dec=false;
            }
            if(!inc && !dec) return -1;
        }
        if(inc){
            return Math.min(i,n-i+2);
        }
        return Math.min(n-i,i+2);
    }
}
class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int n=nums.length;
        if(n==1) return -1;
        long[] pro=new long[n];
        pro[n-1]=1;
        long limit=(long)1e14;
        for(int i=n-2;i>=0;i--){
            long val=nums[i+1]*pro[i+1];
            if(val>limit) val=limit;
            pro[i]=val;
        }
        long sum=0;
        for(int i=0;i<n;i++){
            if(sum==pro[i]){
                return i;
            }
            sum+=nums[i];
        }
        return -1;
        
    }
}
class Solution {
    public int subarraySum(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        arr[0]=nums[0];
        for(int i=1;i<n;i++){
            arr[i]=nums[i]+arr[i-1];
        }
        int sum=0;
        for(int i=0;i<n;i++){
            int st=Math.max(0,i-nums[i]);
            sum+=arr[i];
            if(st>0){
                sum-=arr[st-1];
            }
        }
        return sum;
    }
}
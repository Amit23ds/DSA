class Solution {
    public int sortableIntegers(int[] nums) {
        int n=nums.length, ans=0;

        for(int k=1;k*k<=n;k++){
            if(n%k==0){
                if(helper(nums,k)){
                    ans+=k;
                }
                int temp=n/k;
                if(temp!=k && helper(nums,temp)){
                    ans+=temp;
                }
            }
        }
        return ans;
    }
    boolean helper(int[] nums,int k){
        int n=nums.length, prev=0;

        for(int i=0;i<n;i+=k){
            int cnt=0;
            int min=nums[i], max=nums[i];
            for(int j=i;j<i+k-1;j++){
                if(nums[j]>nums[j+1]){
                    cnt++;
                }
                min=Math.min(min,nums[j+1]);
                max=Math.max(max,nums[j+1]);
            }
            if(nums[i+k-1]>nums[i]){
                cnt++;
            }
            if(cnt>1 || prev>min){
                return false;
            }
            prev=max;
        }
        return true;
    }
}
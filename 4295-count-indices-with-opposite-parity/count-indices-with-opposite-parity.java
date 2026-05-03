class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=i+1;j<n;j++){
                if(nums[i]%2==0){
                    //even then find odd
                    if(nums[j]%2!=0) cnt++;
                }else{
                    //odd then find even
                    if(nums[j]%2==0) cnt++;
                }
                ans[i]=cnt;
            }
        }
        return ans;
    }
}
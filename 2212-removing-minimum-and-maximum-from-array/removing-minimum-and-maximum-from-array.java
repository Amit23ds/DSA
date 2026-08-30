class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=0;
        for(int i=0;i<n;i++){
            if(nums[i]<nums[l]){
                l=i;
            }else if(nums[i]>nums[r]){
                r=i;
            }
        }
        if(l<r){
            int temp=l;
            l=r;
            r=temp;
        }
        int res=n;
        for(int i=0;i<n;i++){
            int temp=0;
            if(r>=i){
                temp=n-r;
            }else if(l>=i){
                temp=n-l;
            }
            res=Math.min(res,i+temp);
        }

        return res;
    }
}
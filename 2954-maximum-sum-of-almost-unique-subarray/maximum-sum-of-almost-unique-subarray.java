class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        int l=0,r=0;
        long ans=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        long sum=0;
        while(r<nums.size()){
            hm.put(nums.get(r),hm.getOrDefault(nums.get(r),0)+1);
            sum+=nums.get(r);
            while((r-l+1)>k){
                sum-=nums.get(l);
                hm.put(nums.get(l),hm.getOrDefault(nums.get(l),0)-1);
                if(hm.get(nums.get(l))==0){
                    hm.remove(nums.get(l));
                }
                l++;
            }
            if(hm.size()>=m && (r-l+1)==k){
                ans=Math.max(ans,sum);
            }
            r++;
        }
        return ans;
    }
}
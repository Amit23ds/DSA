class Solution {
    private int helper(int[] nums, int k){
        int l=0, r=0;
        int cnt=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        while(r<nums.length){
            hm.put(nums[r],hm.getOrDefault(nums[r],0)+1);

            while(hm.size()>k){
                hm.put(nums[l],hm.get(nums[l])-1);
                if(hm.get(nums[l])==0){
                    hm.remove(nums[l]);
                }
                l++;
            }
            if(hm.size()<=k) cnt+=r-l+1;
            r++;
        }
        return cnt;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
}
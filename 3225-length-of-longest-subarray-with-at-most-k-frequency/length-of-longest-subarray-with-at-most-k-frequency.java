class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int l=0,r=0;
        int maxLength=0;
        while(r<nums.length){
            hm.put(nums[r],hm.getOrDefault(nums[r],0)+1);
            while(hm.get(nums[r])>k){
                hm.put(nums[l],hm.getOrDefault(nums[l],0)-1);
                l++;
            }
            maxLength=Math.max(r-l+1,maxLength);
            r++;
        }
        return maxLength; 
    }
}
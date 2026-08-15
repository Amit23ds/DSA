class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l=0,r=0;
        int ans=0,sum=0;
	    Set<Integer> set = new HashSet<>();
	    while(r<nums.length){
            while(!set.add(nums[r])){
                sum-=nums[l];
                set.remove(nums[l]);
                l++;
            }
            sum+=nums[r];
            ans=Math.max(ans,sum);
            r++;
        }   
	return ans;
    }
}
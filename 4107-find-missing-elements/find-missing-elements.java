class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int min=nums[0], max=nums[n-1], i=1;
        while(i<n){
            min++;
            if(nums[i]!=min){
                ans.add(min);
            }else{
                i++;
            }
        }
        return ans;
    }
}
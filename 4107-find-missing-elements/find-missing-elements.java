class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int min=nums[0], max=nums[n-1], i=1;
        // for(int i=1;i<n;i++){
        //     min++;
        //     if(nums[i]!=min){
        //         ans.add(min);
        //     }
        // }
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
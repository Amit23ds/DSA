class Solution {
    // public List<List<Integer>> subsets(int[] nums) {
    //     int n = nums.length;
    //     int subsets = 1 << n; //2^n
    //     List<List<Integer>> ans = new ArrayList<>();
    //     for (int num = 0; num < subsets; num++) {
    //         List<Integer> subset = new ArrayList<>();
    //         for (int i = 0; i < n; i++) {
    //             if ((num & (1 << i)) != 0) { // check the set bit
    //                 subset.add(nums[i]);
    //             }
    //         }
    //         ans.add(subset);
    //     }
    //     return ans;
    // }
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        helper(nums,0,new ArrayList<>());
        return result;
    }
    void helper(int[] nums,int idx,List<Integer> temp){
        if(idx>=nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        helper(nums,idx+1,temp);
        temp.add(nums[idx]);
        helper(nums,idx+1,temp);
        temp.remove(temp.size() - 1);
    }
}
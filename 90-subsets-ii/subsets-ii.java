class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        helper(nums,0,new ArrayList<>());
        return result;
    }
    void helper(int[] nums,int idx,List<Integer> temp){
        if(idx>=nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        int next = idx + 1;
        while(next<nums.length && nums[next]==nums[idx]) {
            next++;
        }
        helper(nums,next,temp);
        //helper(nums,idx+1,temp);
        temp.add(nums[idx]);
        helper(nums,idx+1,temp);
        temp.remove(temp.size() - 1);
    }

}
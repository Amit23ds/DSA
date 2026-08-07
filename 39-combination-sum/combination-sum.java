class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates,0,target,new ArrayList<>());
        return result;
    }
    void helper(int[] nums,int idx,int target,List<Integer> temp){
        if(target==0){
            result.add(new ArrayList<>(temp));
            return;
        }
        if(idx>=nums.length || target<0) return;
        helper(nums,idx+1,target,temp);
        temp.add(nums[idx]);
        helper(nums,idx,target-nums[idx],temp);
        temp.remove(temp.size()-1);
    }
}
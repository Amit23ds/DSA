class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(candidates,0,target,new ArrayList<>());
        return result;
    }
    void helper(int[] nums,int idx,int target,List<Integer> temp){
        if(target==0){
            result.add(new ArrayList<>(temp));
            return;
        }
        if(target<0 || idx>=nums.length) return;
        int next=idx+1;
        while(next<nums.length && nums[next]==nums[idx]){
            next++;
        }
        helper(nums,next,target,temp);
        temp.add(nums[idx]);
        helper(nums,idx+1,target-nums[idx],temp);
        temp.remove(temp.size()-1);
    }
}
class Solution {
    // List<List<Integer>> result = new ArrayList<>();
    // public List<List<Integer>> combinationSum3(int k, int n) {
    //     int[] nums={1,2,3,4,5,6,7,8,9};
    //     helper(nums,0,k,n,new ArrayList<>());
    //     return result;
    // }
    // void helper(int[] nums,int idx,int k,int n, List<Integer> temp){
    //     if(n==0 && temp.size()==k){
    //         result.add(new ArrayList<>(temp));
    //         return;
    //     }
    //     if(idx>=nums.length || n<0) return;
    //     helper(nums,idx+1,k,n,temp);
    //     temp.add(nums[idx]);
    //     helper(nums,idx+1,k,n-nums[idx],temp);
    //     temp.remove(temp.size()-1);
    // }
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        //int[] nums={1,2,3,4,5,6,7,8,9};
        helper(1,k,n,new ArrayList<>());
        return result;
    }
    void helper(int num,int k,int n, List<Integer> temp){
        if(n==0 && temp.size()==k){
            result.add(new ArrayList<>(temp));
            return;
        }
        if(num>9 || n<0) return;
        helper(num+1,k,n,temp);
        temp.add(num);
        helper(num+1,k,n-num,temp);
        temp.remove(temp.size()-1);
    }
}
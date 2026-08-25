class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> hm = new HashSet<>();
        for(int val:nums){
            hm.add(val);
        }
        int res=k;
        while(hm.contains(res)){
            res+=k;
        }
        return res;
    }
}
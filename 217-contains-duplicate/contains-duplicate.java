class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i]) && hm.get(nums[i])>=1){
                return true;
            }
            hm.put(nums[i],hm.getOrDefault(nums[i],0) +1 );
        }
        // for(Integer key : hm.keySet()){
        //     if(hm.get(key)>1){
        //         return true;
                
        //     }
        // }
        return false;
    }
}
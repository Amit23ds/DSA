class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int k=hm.size();
        int l=0,r=0;
        int res=0;
        HashMap<Integer,Integer> temp = new HashMap<>();
        while(r<nums.length){
            temp.put(nums[r],temp.getOrDefault(nums[r],0)+1);
            while(temp.size()==k){
                res+=nums.length-r;
                temp.put(nums[l],temp.getOrDefault(nums[l],0)-1);
                if(temp.get(nums[l])==0){
                    temp.remove(nums[l]);
                }
                l++;

            }
            r++;
        }
        return res;
    }
}
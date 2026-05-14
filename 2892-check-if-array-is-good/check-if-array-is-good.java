class Solution {
    private int maxElement(int[] nums){
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
    public boolean isGood(int[] nums) {
        int max=maxElement(nums);
        int n=nums.length;
        if(max+1!=n) return false;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int i=1;i<max;i++){
            if(!hm.containsKey(i)) return false;
            if(hm.get(i)!=1) return false;
        }
        if(hm.get(max)!=2) return false;

        return true;
    }
}
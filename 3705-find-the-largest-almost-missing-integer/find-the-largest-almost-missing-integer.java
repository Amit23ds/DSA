class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        if(n==k){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                max=Math.max(max,nums[i]);
            }
            return max;
        }
        if(k==1){
            int max=-1;
            for(int i=0;i<n;i++){
                if(hm.get(nums[i])==1 && nums[i]>max){
                    max=nums[i];
                }
            }
            return max;
        }
        if(nums[0]==nums[n-1]) return -1;

        if(hm.get(nums[0])==1 && hm.get(nums[n-1])==1){
            return Math.max(nums[0],nums[n-1]);
        }
        if(hm.get(nums[0])==1 && hm.get(nums[n-1])>1){
            return nums[0];
        }
        if(hm.get(nums[0])>1 && hm.get(nums[n-1])==1){
            return nums[n-1];
        }
        return -1;
    }
}
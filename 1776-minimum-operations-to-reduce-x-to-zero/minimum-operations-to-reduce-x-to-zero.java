class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            hm.put(sum,i);
        }
        if(sum<x){
            return -1;
        }
        int target=sum-x;
        sum=0;
        int len=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(hm.containsKey(sum-target)){
                len=Math.max(len,i-hm.get(sum-target));
            }
        }
        if(len==Integer.MIN_VALUE){
            return -1;
        }
        return nums.length-len;
    }
}
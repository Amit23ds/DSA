class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int cnt=0;
        int prefix=0;
        HashMap<Integer,Integer> hm =new HashMap<>();
        hm.put(0,1);
        for(int num:nums){
            prefix+=num;
            int mod=prefix%k;
            if(mod<0) mod+=k;

            if(hm.containsKey(mod)){
                cnt+=hm.get(mod);
                hm.put(mod,hm.get(mod)+1);
            }else{
                hm.put(mod,1);
            }
        }
        return cnt;
    }
}
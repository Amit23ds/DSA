class Solution {
    int helper(HashMap<Integer,Integer> hm){
        int msf=hm.keySet().iterator().next();
        for(Integer key:hm.keySet()){
            if(hm.get(key)<hm.get(msf) || hm.get(key)==hm.get(msf) && key>msf){
                msf=key;
            }
        }
        return msf;
    }
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        int j=0;
        int[] res=new int[nums.length];
        while(hm.size()!=0){
            int x=helper(hm);
            int freq=hm.get(x);
            for(int i=0;i<freq;i++){
                res[j++]=x;
            }
            hm.remove(x);
        }
        return res;
    }
}
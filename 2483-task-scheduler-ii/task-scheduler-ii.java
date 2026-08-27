class Solution {
    public long taskSchedulerII(int[] tasks, int space) {
        Map<Integer,Long> hm= new HashMap<>();
        long res=0;
        for(int val:tasks){
            res++;
            if(hm.containsKey(val)){
                res=Math.max(res,hm.get(val)+space+1);
            }
            hm.put(val,res);
        }
        return res;
    }
}
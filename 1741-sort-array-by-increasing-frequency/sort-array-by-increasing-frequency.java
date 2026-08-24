class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
                                if(a[1]!=b[1]){
                                    return a[1]-b[1];
                                }
                                return b[0]-a[0];
                                                });
        for(int num:hm.keySet()){
            pq.add(new int[]{num,hm.get(num)});
        }
        int[] res=new int[nums.length];
        int i=0;
        while(!pq.isEmpty()){
            int x=pq.remove()[0];
            int freq=hm.get(x);
            for(int j=0;j<freq;j++){
                res[i++]=x;
            }
        }
        return res;
    }
}
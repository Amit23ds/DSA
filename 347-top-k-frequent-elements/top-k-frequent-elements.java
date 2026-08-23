class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int val:nums){
            hm.put(val,hm.getOrDefault(val,0)+1);
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);

        for(int val:hm.keySet()){
            pq.add(new int[]{val,hm.get(val)});
            if(pq.size()>k){
                pq.remove();
            }
        }
        int ans[]=new int[k];
        int i=0;
        while(!pq.isEmpty()){
            ans[i++]=pq.remove()[0];
        }
        return ans;
    }

}
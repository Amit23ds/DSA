class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int val:stones){
            pq.add(val);
        }
        while(pq.size()>1){
            int x=pq.remove();
            int y=pq.remove();
            if(Math.abs(x-y)!=0){
                pq.add(Math.abs(x-y));
            }
        }
        if(pq.isEmpty()) return 0;
        return pq.remove();
    }
}
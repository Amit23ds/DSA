class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int val:arr){
            if(k>0){
                pq.add(val);
                k--;
            }else if(Math.abs(pq.peek()-x) > Math.abs(val-x)){
                pq.remove();
                pq.add(val);
            }
        }
        List<Integer> res=new ArrayList<>();
        while(!pq.isEmpty()){
            res.add(pq.remove());
        }
        return res;
    }
}